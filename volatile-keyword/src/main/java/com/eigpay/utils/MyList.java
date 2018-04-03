package com.eigpay.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-02 下午 03:01
 */
public class MyList {

    /** 临界资源 */
    /** 此处不加volatile，会造成线程B死循环 */
    private List list = new ArrayList(6);

    /** 此处加上了volatile,同步了，线程B能够退出循环 */
  /**  private volatile List list = new ArrayList(6); */

    /** 对临界资源的访问 */
    public void add() {
        list.add("rico");
    }

    public int size() {
        return list.size();
    }

}
