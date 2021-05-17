package com.imooc.aware;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MoocBeanName implements BeanNameAware, ApplicationContextAware {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        log.info("==============MoocBeanName : " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        log.info("=================setMoocBeanNameApplicationContext : " + applicationContext.getBean(this.beanName).hashCode());
    }

}
