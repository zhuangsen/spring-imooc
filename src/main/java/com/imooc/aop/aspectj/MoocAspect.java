package com.imooc.aop.aspectj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MoocAspect {
    private static Logger log = LogManager.getLogger();
    //	Log log = LogFactory.getLog(this.getClass());

    // execution 匹配方法执行的连接点
    @Pointcut("execution(* com.imooc.aop.aspectj.biz.*Biz.*(..))")
    public void pointcut() {
        // 切入点不会打印
        log.info("------------------pointcut.------------------");
    }

    @Pointcut("within(com.imooc.aop.aspectj.biz.*)")
    public void bizPointcut() {
        // 切入点不会打印
        log.info("------------------bizPointcut.------------------");
    }

//    @Pointcut("execution(* com.imooc.aop.aspectj.biz.*Biz.*(..)) && @annotation(moocMethod)")
//    public void pointcut(MoocMethod moocMethod) {
//    }

    @Before("pointcut()")
    // @Before("execution(* com.imooc.aop.aspectj.biz.*Biz.*(..))")
    public void before() {
        log.info("------------------Before.------------------");
    }

    @Before("pointcut() && args(arg)")
    public void beforeWithParam(String arg) {
        log.info("------------------BeforeWithParam: {}------------------", arg);
    }

    @Before("pointcut() && @annotation(moocMethod)")
    public void beforeWithAnnotation(MoocMethod moocMethod) {
        log.info("------------------BeforeWithAnnotation: {}------------------", moocMethod.value());
    }

//    @Before("pointcut(moocMethod)")
//    public void beforeWithAnnotation1(MoocMethod moocMethod) {
//        log.info("------------------BeforeWithAnnotation: {}------------------", moocMethod.value());
//    }

    @AfterReturning(pointcut = "bizPointcut()", returning = "returnValue")
    public void afterReturning(Object returnValue) {
        log.info("------------------AfterReturning : {}------------------", returnValue);
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "e")
    public void afterThrowing(RuntimeException e) {
        log.info("------------------AfterThrowing : {}------------------", e.getMessage());
    }

    @After("pointcut()")
    public void after() {
        log.info("------------------After.------------------");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        log.info("------------------Around 1.------------------");
        Object obj = pjp.proceed();
        log.info("------------------Around 2.------------------");
        log.info("------------------Around: {}------------------", obj);
        return obj;
    }
}
