package com.ggghost.common.filter;

import com.ggghost.common.enums.HttpMethod;
import com.ggghost.common.utils.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 防止XSS攻击过滤器
 *
 * @author ggghost
 * @create 2023/9/22 22:35
 */
public class XssFilter implements Filter
{
    /**
     * 排除链接
     */
    public List<String> excludes = new ArrayList<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        String tempExcludes = filterConfig.getInitParameter("excludes");
        if (StringUtils.isNotEmpty(tempExcludes))
        {
            String[] url = tempExcludes.split(",");
            for (int i = 0; url != null && i < url.length; i++)
            {
                excludes.add(url[i]);
            }
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        if (handExcludeURL(request, response))
        {
            filterChain.doFilter(request, response);
            return;
        }
        XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper(request);
        filterChain.doFilter(xssRequest, response);

    }

    private boolean handExcludeURL(HttpServletRequest request, HttpServletResponse response)
    {
        String url = request.getServletPath();
        String method = request.getMethod();
        //GET DELETE 不过滤
        if (method == null || HttpMethod.GET.matches(method) || HttpMethod.DELETE.matches(method))
        {
            return true;
        }
        return StringUtils.matches(url, excludes);
    }

    @Override
    public void destroy()
    {

    }
}
