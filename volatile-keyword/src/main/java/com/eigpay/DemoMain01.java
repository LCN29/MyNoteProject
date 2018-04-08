package com.eigpay;

import com.eigpay.threads.ThreadA;
import com.eigpay.threads.ThreadB;
import com.eigpay.utils.MyList;

/**
 * Hello world!
 *
 */
public class DemoMain01 {

    public static void main( String[] args ) {

        MyList service = new MyList();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }

}
