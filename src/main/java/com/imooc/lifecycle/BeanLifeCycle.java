package com.imooc.lifecycle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {

    //    private static Logger log= LogManager.getLogger();
    private Log log = LogFactory.getLog(this.getClass());

    // default-2
    public void defaultInit() {
        log.info("Bean defaultInit.");
    }

    // default-4
    public void defaultDestroy() {
        log.info("Bean defaultDestroy.");
    }

    // default-3  init-3
    @Override
    public void destroy() throws Exception {
        log.info("Bean destroy.");
    }

    // default-1  init-1
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Bean afterPropertiesSet.");
    }

    //   init-2
    public void start() {
        log.info("Bean start .");
    }

    //   init-4
    public void stop() {
        log.info("Bean stop.");
    }

}
