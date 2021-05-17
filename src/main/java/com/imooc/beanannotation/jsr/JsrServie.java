package com.imooc.beanannotation.jsr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

//@Service
@Named
public class JsrServie {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());


//    @Resource
//    private JsrDAO jsrDAO;
//
//    @Resource
//    public void setJsrDAO(JsrDAO jsrDAO) {
//        this.jsrDAO = jsrDAO;
//    }


    /**
     * jsr330标准注解
     */
    // 一种方式
    // @Inject
    private JsrDAO jsrDAO;

    // 另一种方式
    @Inject
    public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    @PostConstruct
    public void init() {
        log.info("***********************JsrServie init.***********************");
    }

    @PreDestroy
    public void destroy() {
        log.info("***********************JsrServie destroy.***********************");
    }

    public void save() {
        jsrDAO.save();
    }
}
