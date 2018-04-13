package com.eigpay.two;

import com.eigpay.two.model.Person;
import com.eigpay.two.util.MyComparator;
import com.eigpay.two.util.TestFnInter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import java.util.stream.Stream;


/**
 * description: 方法引用
 *
 * @author LCN
 * @date 2018-02-24 上午 09:53
 */
public class Main {

    private Person personArray[] = { new Person("Xin"), new Person("Lcn"), new Person("Can"),};

    public Main() {
    }

    public static void main(String[] args) {
        Main main = new Main();
      //  main.fn1();
      //   main.fn2();
      //   main.fn3();
      //  main.fn4();
      //  main.fn5();
     //   main.fn6();

        String str[] = Stream.of("A", "is", "a", "dog").toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        System.out.println(Stream.of("A", "is", "a", "dog").toArray(String[]::new).length);


    }

    /**
     *  方式一 : 创建匿名类
     */
    private void fn1() {
        Arrays.sort(personArray, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i = 0; i <personArray.length ; i++) {
            System.out.println(personArray[i].getName());
        }
    }

    /**
     *  方式二 : Lambda表达式
     */
    private void fn2() {
        Arrays.sort(personArray,(a, b)-> a.getName().compareTo(b.getName()));

        for (int i = 0; i <personArray.length ; i++) {
            System.out.println(personArray[i].getName());
        }
    }

    /**
     *  方式三 : 静态方法引用
     */
    private void fn3() {
        Arrays.sort(personArray, Person::compareName);
        for (int i = 0; i <personArray.length ; i++) {
            System.out.println(personArray[i].getName());
        }
    }

    private void fn4() {
        MyComparator comparator = new MyComparator();
        Arrays.sort(personArray, comparator::comparePerson);
        for (int i = 0; i <personArray.length ; i++) {
            System.out.println(personArray[i].getName());
        }
    }

    private void fn5() {
        String str = Stream.of("A", "is", "a", "dog").reduce("",String::concat);
        System.out.println(str);
    }

    private void fn6 () {
        test(new TestFnInter() {
            @Override
            public void san(Person p, String str) {
                System.out.println(p.getName()+"其他的话"+str);
            }
        });
    }

    private void test(TestFnInter testFnInter) {
        Person p1 = new Person("66666");
        String str = "屁话";
        testFnInter.san(p1, str);
    }

}
