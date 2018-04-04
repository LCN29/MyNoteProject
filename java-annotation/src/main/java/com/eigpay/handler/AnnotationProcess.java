package com.eigpay.handler;

import com.eigpay.annotation.MyAnnotation;

import java.lang.annotation.Annotation;

/**
 * Description: 注解处理器
 *
 * @Author LCN
 * @Date 2018-04-03 下午 02:20
 */

public class AnnotationProcess {

    /**
     * 通过类的全路径获取注解在类上的注解
     * @param className
     */
    public static void process(String className) throws ClassNotFoundException{
        Class clazz = Class.forName(className);
        process(clazz);
    }

    /**
     * 通过Class对象获取注解在类上的注解
     * @param clazz
     */
    public static void process(Class clazz) {

        Annotation[] aArray = clazz.getAnnotations();
        // 如果是MyAnnotation注解打印出count的值
        for( Annotation an :aArray) {
            System.out.println(an);
            if (an instanceof MyAnnotation) {
                System.out.println(((MyAnnotation) an).count());
            }
        }
    }

}
