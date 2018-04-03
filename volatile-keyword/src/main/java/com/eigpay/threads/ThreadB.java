package com.eigpay.threads;

import com.eigpay.utils.MyList;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-02 下午 03:04
 */
public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        // 任务 B
        try {
            while (true) {
                if (list.size() == 4) {
                    System.out.println("list中的元素个数为4了，线程b要退出了！");
                    throw new InterruptedException();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
