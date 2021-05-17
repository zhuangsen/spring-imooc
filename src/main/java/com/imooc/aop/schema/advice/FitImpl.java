package com.imooc.aop.schema.advice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FitImpl implements Fit {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

	@Override
	public void filter() {
        log.info("--------------FitImpl filter.--------------");
	}

}
