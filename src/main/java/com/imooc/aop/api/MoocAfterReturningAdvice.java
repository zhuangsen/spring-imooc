package com.imooc.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MoocAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("MoocAfterReturningAdviceMethod:" + method.getName());
		System.out.println("targetClassName" + target.getClass().getName());
		System.out.println("returnValue" + returnValue);
	}

}
