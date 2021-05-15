package com.imooc.beanannotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.beanannotation.injection.dao.InjectionDAO;

@Service
public class InjectionServiceImpl implements InjectionService {
	
	/**
	 * 第一种方式
	 */
//	@Autowired
//	private InjectionDAO injectionDAO;
	
	/**
	 * 第二种方式
	 */
/*	private InjectionDAO injectionDAO;
	@Autowired
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}*/
	
	
	/**
	 * 第三种方式
	 */
	private InjectionDAO injectionDAO;
	@Autowired
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}
	

	
	@Override
	public void save(String arg) {
		//模拟业务操作
		System.out.println("Service接收参数：" + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}
	
}
