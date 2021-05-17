package com.imooc.beanannotation.javabased;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyDriverManager {
    private static Logger log = LogManager.getLogger();
    //	Log log = LogFactory.getLog(this.getClass());

    public MyDriverManager(String url, String userName, String password) {
        log.info("url : {}",url);
        log.info("userName: {}", userName);
        log.info("password: {}", password);
    }
}
