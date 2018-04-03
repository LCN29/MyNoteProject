package com.eigpay.threads;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-02 下午 04:06
 */
public class ThreadDemo02 extends Thread {

    // volatile 共享静态变量，类成员
    public volatile static int count;

    /** volatile不保证原子性，
     * 自增操作是不具备原子性的，它包括 读取变量的原始值、进行加1操作 和 写入工作内存 三个原子操作
     * 所以存在这种情况
     * 线程1读取count（假设为10）,然后其被阻塞了，线程2也去读取count，此时仍为10，然后进行加1，没
     * 将其值写到 线程2 的工作内存中去，此时线程2 被阻塞，线程1 进行加 1 操作时，注意操作数count仍
     * 然是 10。然后，线程2 把 11 写入工作内存并刷到主内存，虽然此时 线程1 能感受到 线程2 对count
     * 的修改，但由于线程1只剩下对count的写操作了，而不必对count进行读操作了，所以此时 线程2 对
     * count的修改并不能影响到 线程1。于是，线程1 也将 11 写入工作内存并刷到主内存。也就是说，两
     * 个线程分别进行了一次自增操作后，count 只增加了1
     * */
    private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("执行完成."+ "count=" + count);
    }

    /** 加上 synchronized 可以解决这个问题 */
    private synchronized static void addCount2() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
        // addCount2();
    }

}
