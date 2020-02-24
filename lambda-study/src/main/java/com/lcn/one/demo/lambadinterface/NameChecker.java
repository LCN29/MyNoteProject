package com.lcn.one.demo.lambadinterface;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 下午 02:51
 */
@FunctionalInterface
public interface NameChecker<T> {

    boolean check(T p);

}
