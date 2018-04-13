package com.eigpay.two.model;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-24 上午 09:50
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int compareName(Person a, Person b) {
        return a.getName().compareTo(b.name);
    }

}
