package com.imooc.resource;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class MoocResource implements ApplicationContextAware {
    private static Logger log= LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void resource() throws IOException {
		 Resource resource = applicationContext.getResource("config.txt");
//		Resource resource = applicationContext.getResource("classpath:config.txt");
//		Resource resource = applicationContext.getResource("file:\\Users\\madison\\Documents\\workspace\\spring\\src\\main\\resources\\config.txt"); //读取不出来
//		Resource resource = applicationContext.getResource("file:/Users/madison/Documents/workspace/spring/src/main/resources/config.txt");
//		Resource resource = applicationContext.getResource("url:https://www.baidu.com");
//        System.out.println(resource.getFilename());
//        System.out.println(resource.contentLength());
		log.info("resource name:{}",resource.getFilename());
		log.info("resource content length:{}",resource.contentLength());
	}

}
