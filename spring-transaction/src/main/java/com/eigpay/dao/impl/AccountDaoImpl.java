package com.eigpay.dao.impl;

import com.eigpay.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-03-31 下午 02:01
 */

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    @Override
    public void increaseMoney(String acct, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, acct);
    }

    @Override
    public void decreaseMoney(String acct, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, acct);
    }
}
