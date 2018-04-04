package com.eigpay;

import com.eigpay.bean.MyBean;
import com.eigpay.handler.ParamVerifyHandler;
import org.junit.Test;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-03 下午 04:27
 */
public class ParamVerifyAnnoTest {

    @Test
    public void testVerify() {
        MyBean bean01 = new MyBean();
        bean01.setSex("男");
        bean01.setName("滚滚滚");
        ParamVerifyHandler.Result result = new ParamVerifyHandler.Result();

        try {
            result = ParamVerifyHandler.paramVerify(bean01);
            System.out.println(result.getHint());
        } catch (Exception e) {
            e.printStackTrace();
        }

        bean01 = new MyBean();
        bean01.setSex("男女男");
        bean01.setName("滚滚滚");
        try {
            result = ParamVerifyHandler.paramVerify(bean01);
            System.out.println(result.getHint());
        } catch (Exception e) {
            e.printStackTrace();
        }

        bean01 = new MyBean();
        bean01.setSex("男");
        bean01.setName("滚滚滚滚滚滚");
        try {
            result = ParamVerifyHandler.paramVerify(bean01);
            System.out.println(result.getHint());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
