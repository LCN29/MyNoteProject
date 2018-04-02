package com.eigpay.service;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-01 下午 01:27
 */

public interface AccountService {

    /**
     * 转账方法
     * @param outAcct 转出账户
     * @param inAcct 转入账户
     * @param money 转账金额
     */
    void transfer(String outAcct, String inAcct, Double money);

}
