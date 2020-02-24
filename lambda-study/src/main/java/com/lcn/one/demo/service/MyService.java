package com.lcn.one.demo.service;

import com.lcn.one.demo.lambadinterface.Executor;
import com.lcn.one.demo.lambadinterface.NameChecker;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * description:
 *
 * @author LCN
 * @date 2018-02-22 下午 02:54
 */
public class MyService<T> {

    /**
     * 自定义函数式接口
     */
    public  void checkAndExecute01(List<T> list, NameChecker<T> checker, Executor<T> executor){
        for( T item : list){
            if ( checker.check(item)) {
                executor.execute(item);
            }
        }
    }

    /**
     * 使用官方定义的函数式接口
     */
    public void checkAndExecute02(List<T> list, Predicate<T> predicate, Consumer<T> consumer){
        for ( T item : list) {
            if (predicate.test(item)) {
                consumer.accept(item);
            }
        }
    }

    /**
     * for each 用 Iterable.forEach(Consumer<T> e) 代替
     */
    public void checkAndExecute03(List<T> list, Predicate<T> predicate, Consumer<T> consumer){
        list.forEach(item -> {
            if (predicate.test(item)) {
                consumer.accept(item);
            }
        });
    }



}
