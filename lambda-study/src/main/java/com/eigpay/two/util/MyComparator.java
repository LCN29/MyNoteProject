package com.eigpay.two.util;

import com.eigpay.two.model.Person;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-24 下午 01:45
 */
public class MyComparator {

    public int comparePerson(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }

}
