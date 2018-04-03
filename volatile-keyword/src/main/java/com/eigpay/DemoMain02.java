package com.eigpay;

import com.eigpay.threads.ThreadDemo;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-02 下午 03:27
 */
public class DemoMain02 {

    public static void main(String[] args) {

        ThreadDemo td = new ThreadDemo();
        new Thread(td, "ThreadDemo").start();

        while (true) {

            // 此次会陷入死循环 ，

            // 但是加入下面其中的任意一个语句都可以跳出循环
            // System.out.println("!!");            // 语句1
            // synchronized (DemoMain02.class) {}   // 语句2
            // DemoMain02.test();                   // 语句3

            /** 单纯的加上语句4，是不会跳出循环的 */
            //DemoMain02.test1();                   // 语句4


            if (td.flag) {
                System.out.println("线程 " + Thread.currentThread().getName() + " 即将跳出while循环体... ");
                break;
            }
        }
    }

    /**
     *  2, 3 能够退出循环的原因是synchronized的作用：会导致线程工作内存（相当于线程自身的缓存）与主存的同步，
     *  使得其他线程可以取得共享变量的最新值
     *  也就是说，synchronized 语义范围不但包括 volatile 具有的可见性，也包括原子性，但不能禁止指令重排序
     *  而 volatile 具有可见性和禁止指令重排序 ，这是2个的区别
     *  1能退出循环的原因是 System.out.println() 方法里面包含 synchronized块
     *  public void println(String x) {
     *      synchronized (this) {
     *          print(x);
     *          newLine();
     *      }
     *  }
     */

    public static void test1(){
    }

    public synchronized static void test2() {
    }

}
