package com.eigpay.three.model;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-26 下午 04:26
 */
public class Demo {

    private String name;
    private int age;

    private String show(String name) {
        System.out.println(name);
        return "6666";
    }

    public void showAge() {
        System.out.println("123321");
    }

    protected void showDemo() {
        System.out.println("Demo is running");
    }

    public Demo() {
    }

    public Demo(String name, int age ) {
        this.name = name;
        this.age = age;
    }

}
