package com.eigpay.dao;

/**
 * Description: 转账的dao层接口
 *
 * @Author LCN
 * @Date 2018-03-31 下午 01:51
 */

public interface AccountDao {

    /**
     *  给某个账户加钱
     * @param acct 账户
     * @param money 金额
     */
    void increaseMoney(String acct, Double money);


    /**
     *  给某个账户减钱
     * @param acct 账户
     * @param money 金额
     */
    void decreaseMoney(String acct, Double money);

}
