package com.eigpay.three.model;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-25 下午 01:47
 */
public class Student {

    private String name;
    private int age;

    /** 无参的构造函数*/
    public Student() {}

    /** 2个参数的构造函数 */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** 受保护的构造函数 */
    protected Student(String name) {
        this.name = name;
    }

    /** 私有的构造函数 */
    private Student(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
