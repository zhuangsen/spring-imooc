package com.imooc.aware;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MoocApplicationContext implements ApplicationContextAware  {
    private static Logger log= LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
        log.info("=========setMoocApplicationContext : " + applicationContext.getBean("moocApplicationContext").hashCode());
	}
	
}
