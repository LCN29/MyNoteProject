package com.lcn.one.demo.lambadinterface;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 下午 02:53
 */
@FunctionalInterface
public interface Executor<T> {

    void execute(T p);

}
