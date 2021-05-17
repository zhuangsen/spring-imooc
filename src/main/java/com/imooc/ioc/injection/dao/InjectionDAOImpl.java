package com.imooc.ioc.injection.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InjectionDAOImpl implements InjectionDAO {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    @Override
    public void save(String arg) {
        //模拟数据库保存操作
        log.info("=============保存数据：" + arg);
    }
}
