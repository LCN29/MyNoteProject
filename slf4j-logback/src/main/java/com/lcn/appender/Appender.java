package com.lcn.appender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-09 上午 10:29
 */
public class Appender {

    private static Logger logger = LoggerFactory.getLogger(Appender.class);

    public void showLog() {
        logger.trace("trance");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
