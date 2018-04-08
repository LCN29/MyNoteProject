package com.eigpay.test;

import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 03:08
 */

@Service
public class SpringInterfaceImpl implements SpringInterface {
    @Override
    public String saySpring() {
        return "Spring";
    }
}
