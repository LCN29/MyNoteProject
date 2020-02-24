package com.lcn.dao.impl;

import com.lcn.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

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
