package com.imooc.ioc.interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OneInterfaceImpl implements OneInterface {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    @Override
    public void say(String arg) {
        log.info("=============ServiceImpl say: " + arg);
    }

}
