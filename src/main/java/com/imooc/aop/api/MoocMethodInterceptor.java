package com.imooc.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoocMethodInterceptor implements MethodInterceptor {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("......................MoocMethodInterceptor 1 : {} \t {}......................"
                , invocation.getMethod().getName(), invocation.getStaticPart().getClass().getName());
        Object obj = invocation.proceed();
        log.info("......................MoocMethodInterceptor 2 : {}......................", obj);
        return obj;
    }
}
