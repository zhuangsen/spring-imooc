package com.imooc.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

//@Service
@Named
public class JsrServie {

	/*
	 * @Resource private JsrDAO jsrDAO;
	 * 
	 * @Resource public void setJsrDAO(JsrDAO jsrDAO) { this.jsrDAO = jsrDAO; }
	 */

	/**
	 * jsr330标准注解
	 */
	// 一种方式
	// @Inject
	private JsrDAO jsrDAO;

	// 另一种一种方式
	@Inject
	public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
		this.jsrDAO = jsrDAO;
	}

	@PostConstruct
	public void init() {
		System.out.println("JsrServie init.");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("JsrServie destroy.");
	}

	public void save() {
		jsrDAO.save();
	}

}
