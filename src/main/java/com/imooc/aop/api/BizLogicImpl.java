package com.imooc.aop.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BizLogicImpl implements BizLogic {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    @Override
    public String save() {
        log.info("...................BizLogicImpl : BizLogicImpl save................");
        return "BizLogicImpl save.";
        // throw new RuntimeException();
    }
}
