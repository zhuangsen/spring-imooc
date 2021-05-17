package com.imooc.aop.schema.advice.biz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AspectBiz {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    public void biz() {
        log.info("------------------AspectBiz biz.------------------");
//        throw new RuntimeException();
    }

    public void init(String bizName, int times) {
        log.info("AspectBiz init : bizName:{},times:{}", bizName, times);
    }

}
