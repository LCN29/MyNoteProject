package com.eigpay.threads;

import com.eigpay.utils.MyList;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-02 下午 03:03
 */
public class ThreadA extends Thread {

    private MyList list;

    public ThreadA(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        // 任务 A
        try {
            for (int i = 0; i < 6; i++) {
                list.add();
                System.out.println("添加了" + (i + 1) + "个元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
