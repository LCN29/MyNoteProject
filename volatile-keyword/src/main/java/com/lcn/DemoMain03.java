package com.lcn;

import com.lcn.threads.ThreadDemo02;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-02 下午 04:07
 */
public class DemoMain03 {

    public static void main(String[] args) {
        //创建 100个线程并启动
       ThreadDemo02[] mythreadArray = new ThreadDemo02[100];

        for (int i = 0; i < 100; i++) {
            mythreadArray[i] = new ThreadDemo02();
        }

        for (int i = 0; i < 100; i++) {
            mythreadArray[i].start();
        }
    }

}
