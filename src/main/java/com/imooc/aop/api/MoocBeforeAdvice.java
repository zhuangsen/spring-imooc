package com.imooc.aop.api;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class MoocBeforeAdvice implements MethodBeforeAdvice {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        log.info("--------------moocBeforeAdvice : {}\ttargetClass:{}", method.getName(), target.getClass().getName());
    }
}
