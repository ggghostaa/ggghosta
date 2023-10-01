package com.ggghost.common.utils;

import io.jsonwebtoken.*;

import java.util.*;

/**
 * Jwt工具类
 * @author ggghost
 * @create 2023/9/24 20:50
 */
public class JwtUtils {

    private static final String signature = "EldenRing";

    /**
     * 获取token
     *
     * @param token
     * @param Clams
     * @return
     */
    public static String acquireJwt(String token, Map<String, Object> Clams) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 7);//7天过期时间

        JwtBuilder jwtBuilder = Jwts.builder()
                .setSubject("1")//令牌主题
                .setClaims(Clams)
                .setIssuedAt(new Date())
                .setExpiration(calendar.getTime())//过期时间
                .signWith(SignatureAlgorithm.HS256, signature);
        return jwtBuilder.compact();
    }
    public static String parserJwtoString(String token, String key) {
        Claims claims = Jwts.parser().setSigningKey(signature).parseClaimsJws(token).getBody();
        return (String) claims.get(key);
    }

    /**
     * 解析token
     *
     * @param token
     * @param key
     * @return
     */
    public static Object parerJwtToObject(String token, String key) {
        Claims claims = Jwts.parser().setSigningKey(signature).parseClaimsJws(token).getBody();
        return claims.get(key);
    }
}
