package com.ggghost.common.annotation;

import java.lang.annotation.*;

/**
 * 匿名访问不鉴权注解
 * @author ggghost
 * @create 2023/9/22 21:54
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Anonymous {
}
