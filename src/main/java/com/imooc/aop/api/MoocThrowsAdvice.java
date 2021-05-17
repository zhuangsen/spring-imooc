package com.imooc.aop.api;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

public class MoocThrowsAdvice implements ThrowsAdvice {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());


    public void afterThrowing(Exception ex) throws Throwable {
        log.info("..............MoocThrowsAdvice afterThrowing 1..............");
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
        log.info("..............MoocThrowsAdvice afterThrowing 2 : methodName:{}, targetClassName:{}................"
                , method.getName(), target.getClass().getName());
    }
}
