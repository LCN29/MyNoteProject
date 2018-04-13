package com.eigpay.one.demo;

import com.eigpay.one.demo.model.Person;
import com.eigpay.one.demo.service.MyService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 下午 02:58
 */
public class Main {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("XingYun","Li",123));
        list.add(new Person("Xing","Li",223));
        list.add(new Person("Yun","Lin",323));
        list.add(new Person("XingYun","Cao",432));

        Main main = new Main();
        main.fn01(list);
        System.out.println("---------过渡线1-----------");
        main.fn02(list);
        System.out.println("---------过渡线2-----------");
        main.fn03(list);
        System.out.println("---------过渡线3-----------");
        main.fn04(list);

        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("ints sum is:" + ints.stream().reduce((sum, item)-> sum+item).get());
    }

    private void fn01 (List<Person> list) {
        MyService<Person> service = new MyService<>();
        service.checkAndExecute01(
                list,
                p-> p.getLastName().startsWith("L"),
                p -> System.out.println(p.getFirstName())
        );
    }

    private void fn02 (List<Person> list) {
        MyService<Person> service = new MyService<>();
        service.checkAndExecute02(
                list,
                p -> p.getLastName().startsWith("L"),
                p -> System.out.println(p.getFirstName())
        );
    }

    private void fn03 (List<Person> list) {
        MyService<Person> service = new MyService<>();
        service.checkAndExecute03(
                list,
                p -> p.getLastName().startsWith("L"),
                p -> System.out.println(p.getFirstName())
        );
    }

    private void fn04(List<Person> list){
        list.stream()
            .filter( p -> p.getLastName().startsWith("L"))
            .forEach( p-> System.out.println(p.getFirstName()));
    }

}
