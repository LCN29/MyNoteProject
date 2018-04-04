package com.eigpay.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: 参数验证注解
 *
 * @Author LCN
 * @Date 2018-04-03 下午 03:14
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ParamVerifyAnno {

    /**
     * 最大的长度
     * @return
     */
    public int maxLength() default -1;

}