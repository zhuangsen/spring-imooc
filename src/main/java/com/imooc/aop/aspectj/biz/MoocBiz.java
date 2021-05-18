package com.imooc.aop.aspectj.biz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.imooc.aop.aspectj.MoocMethod;

@Service
public class MoocBiz {
    private static Logger log = LogManager.getLogger();
    //	Log log = LogFactory.getLog(this.getClass());

    @MoocMethod("MoocBiz save with MoocMethod.")
    public String save(String arg) {
        log.info("*********************MoocBiz save : {}*********************", arg);
//		throw new RuntimeException(" Save failed!");
        return " Save success!";
    }
}
