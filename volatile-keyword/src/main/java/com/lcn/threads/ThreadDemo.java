package com.lcn.threads;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-02 下午 03:25
 */
public class ThreadDemo implements Runnable {

   public boolean flag = false;

    /** volatile */
    /*public volatile boolean flag = false;*/

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag = true;
        System.out.println("线程 " + Thread.currentThread().getName() + " 执行完毕。" + "flag的值为" + flag);
    }

}
