package com.imooc.aop.schema.advisors.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

@Service
public class InvokeService {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    public void invoke() {
        log.info("..............InvokeService...............");
    }

    public void invokeException() {
        log.info("..............InvokeException...............");
        throw new PessimisticLockingFailureException("");
    }
}
