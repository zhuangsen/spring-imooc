package com.imooc.aop.schema.advice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    public void before() {
        log.info("----------MoocAspect before.----------");
    }

    public void afterReturning() {
        log.info("----------MoocAspect afterReturning.----------");
    }

    public void afterThrowing() {
        log.info("----------MoocAspect afterThrowing.----------");
    }

    public void after() {
        log.info("----------MoocAspect after.----------");
    }

    public Object around(ProceedingJoinPoint pjp) {
        Object obj = null;
        try {
            log.info("----------MoocAspect around 1.----------");
            obj = pjp.proceed();
            log.info("----------MoocAspect around 2.----------");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return obj;
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) {
        log.info("MoocAspect aroundInit : bizName:{},times:{}", bizName, times);
        Object obj = null;
        try {
            log.info("----------MoocAspect aroundInit 1.----------");
            obj = pjp.proceed();
            log.info("----------MoocAspect aroundInit 2.----------");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return obj;
    }

}
