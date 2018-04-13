package com.eigpay.three.use;

import com.eigpay.three.model.Teacher;

import java.lang.reflect.Field;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-25 下午 07:27
 */
public class Properties {

    public static void main(String[] args) throws Exception {

        Class teacherClass = Teacher.class;

        System.out.println("************获取所有公有的字段********************");
        Field[] fieldArray = teacherClass.getFields();
        for ( Field field : fieldArray ) {
            // public long com.eigpay.three.model.Teacher.test  修饰符  数据类型  包名.类名.变量名
            System.out.println(field);
        }

        System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");
        fieldArray  = teacherClass.getDeclaredFields();
        for ( Field field : fieldArray ) {
            System.out.println(field);
        }

        System.out.println("*************获取单个公有字段并调用***********************************");
        Field f = teacherClass.getField("test");
        System.out.println(f);

        Object obj = teacherClass.getConstructor().newInstance();
        f.set(obj, 123L);
        Teacher teacher = (Teacher)obj;
        System.out.println(teacher.test);

        System.out.println("**************获取私有字段****并调用********************************");
        Field f2 = teacherClass.getDeclaredField("age");
        System.out.println(f2);
        obj = teacherClass.getConstructor().newInstance();
        //暴力反射，解除私有限定
        f2.setAccessible(true);
        f2.set(obj, 123);
        teacher = (Teacher)obj;
        System.out.println(teacher.getAge());

    }

}
