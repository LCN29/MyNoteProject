package com.lcn.bean;

import com.lcn.annotation.ParamVerifyAnno;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-03 下午 03:20
 */
public class MyBean {

    /** 性别 */
    @ParamVerifyAnno(maxLength = 2)
    private String sex;

    /** 姓名 */
    @ParamVerifyAnno(maxLength = 4)
    private String name;

    public MyBean() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
