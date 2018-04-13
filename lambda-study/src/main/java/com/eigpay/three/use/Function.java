package com.eigpay.three.use;

import com.eigpay.three.model.Demo;

import java.lang.reflect.Method;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-26 下午 04:25
 */
public class Function  {

    public static void main(String[] args) throws Exception {

        Class demoClass = Demo.class;
        System.out.println("***************获取所有的”公有“方法 包含父级的*******************");
        Method[] methods = demoClass.getMethods();

        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }

        System.out.println("***************获取所有的方法，包括私有的 只包含自身的*******************");
        methods = demoClass.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m);
        }

        System.out.println("***************获取公有的showAge方法*******************");
        Method m = demoClass.getMethod("showAge");
        System.out.println(m);
        Object obj = demoClass.getConstructor().newInstance();
        m.invoke(obj);

        m = demoClass.getDeclaredMethod("show", String.class);
        System.out.println(m);
        m.setAccessible(true);
        Object result =  m.invoke(obj,"24");
        System.out.println("结果"+ result);

        m = demoClass.getMethod("toString");
        System.out.println(m);


    }



}
