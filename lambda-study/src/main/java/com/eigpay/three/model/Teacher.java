package com.eigpay.three.model;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-25 下午 07:11
 */
public class Teacher {

    private int age;
    public long test;
    protected String name;
    private Grade myGrade;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTest() {
        return test;
    }

    public void setTest(long test) {
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getMyGrade() {
        return myGrade;
    }

    public void setMyGrade(Grade myGrade) {
        this.myGrade = myGrade;
    }
}
