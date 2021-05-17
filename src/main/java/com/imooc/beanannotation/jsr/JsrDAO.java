package com.imooc.beanannotation.jsr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class JsrDAO {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    public void save() {
        log.info("***********************JsrDAO invoked.***********************");
    }
}
