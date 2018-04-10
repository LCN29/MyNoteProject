package com.eigpay.nodebug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 *
 * @Author LCN
 * @Date 2018-04-09 上午 09:39
 */
public class NoDebug {

    private static Logger logger = LoggerFactory.getLogger(NoDebug.class);

    public void showLog() {
        logger.trace("trance");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
