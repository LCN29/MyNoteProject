package com.eigpay.three.use;

import com.eigpay.three.model.Student;

import java.lang.reflect.Constructor;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-25 下午 02:09
 */
public class Constructors {

    public static void main(String[] args) throws Exception {
        Class stuClass = Student.class;
        System.out.println("**********************所有公有构造方法*********************************");
        Constructor[] conArray = stuClass.getConstructors();
        for (int i = 0; i < conArray.length; i++) {
            System.out.println("方法--->"+conArray[i]);
        }

        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
        conArray = stuClass.getDeclaredConstructors();
        for (int i = 0; i < conArray.length; i++) {
            System.out.println("方法--->"+conArray[i]);

        }

        System.out.println("*****************获取公有、无参的构造方法*******************************");
        Constructor con = stuClass.getConstructor();
        System.out.println("方法:"+con);
        Student student = (Student)con.newInstance();
        System.out.println(student);

        System.out.println("******************获取私有构造方法*******************************");
        con = stuClass.getDeclaredConstructor(int.class);
        System.out.println("方法:"+con);

    }

}
