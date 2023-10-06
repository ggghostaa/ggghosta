package com.ggghost.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.TimeZone;

/**
 * 程序注解配置
 *
 * @author ggghost
 * @create 2023/9/24 20:12
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
//@MapperScan("com.ggghost.mapper.framework.system")
public class ApplicationConfig {

    /**
     * 时区配置
     */
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
        return jacksonObjectMapperBuilder ->jacksonObjectMapperBuilder.timeZone(TimeZone.getDefault());
    }
}
