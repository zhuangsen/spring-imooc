package com.imooc.beanannotation.javabased;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntegerStore implements Store<Integer> {

    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    @Override
    public void init() {
        log.info("******************This is IntegerStore init.******************");
    }

    @Override
    public void destroy() {
        log.info("******************This is IntegerStore destroy.******************");
    }
}
