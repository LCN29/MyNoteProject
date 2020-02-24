package com.lcn.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Description: 测试用的注解
 *
 * @Author LCN
 * @Date 2018-04-03 上午 10:16
 */

@Target(value={TYPE,FIELD,METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int count() default 1;
}
