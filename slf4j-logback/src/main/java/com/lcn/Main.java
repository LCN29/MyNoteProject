package com.lcn;

import com.lcn.appender.Appender;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-08 下午 06:59
 */
public class Main {

    public static void main(String[] args) {
    /*    MyLogger logger = new MyLogger();
        logger.showLog();*/

/*        NoDebug noDebug = new NoDebug();
        noDebug.showLog();*/

        Appender logger = new Appender();
        logger.showLog();
    }

}
