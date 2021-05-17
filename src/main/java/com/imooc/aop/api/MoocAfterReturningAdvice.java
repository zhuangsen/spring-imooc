package com.imooc.aop.api;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class MoocAfterReturningAdvice implements AfterReturningAdvice {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("-----------------MoocAfterReturningAdviceMethod: {}-----------------", method.getName());
        log.info("-----------------targetClassName: {}-----------------", target.getClass().getName());
        log.info("-----------------returnValue: {}-----------------", returnValue);
    }
}
