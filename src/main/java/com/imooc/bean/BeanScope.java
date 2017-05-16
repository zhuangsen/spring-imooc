package com.imooc.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BeanScope {

	Log log = LogFactory.getLog(this.getClass());

	public void say() {
		log.debug("BeanScope say : " + this.hashCode());
	}

}
