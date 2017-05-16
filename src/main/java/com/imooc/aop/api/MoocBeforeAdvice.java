package com.imooc.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MoocBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("moocBeforeAdvice : " + method.getName() + "\ttargetClass:" + target.getClass().getName());
	}

}
