package com.lcn.three;

import com.lcn.three.model.Student;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-25 下午 01:50
 */
public class Main {

    public static void main(String[] args) {

        // 第一种获取Class的方式
        //此时会产生一个Student实例和一个Class实例
        Student student = new Student();
        Class stuClass = student.getClass();
        // com.eigpay.three.model.Student
        System.out.println(stuClass.getName());

        // 第二种获取Class的方式
        Class stuClass2 = Student.class;
        System.out.println(stuClass2.getName());

        //第三种获取Class的方式
        try {
            // 此处的字符串为类的完整包路径
            Class stuClass3 = Class.forName("com.lcn.three.model.Student");
            System.out.println(stuClass3.getName());
            System.out.println(stuClass3 == stuClass2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
