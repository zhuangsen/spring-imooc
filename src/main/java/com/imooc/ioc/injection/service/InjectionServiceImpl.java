package com.imooc.ioc.injection.service;

import com.imooc.ioc.injection.dao.InjectionDAO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class InjectionServiceImpl implements InjectionService {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    private InjectionDAO injectionDAO;

    /**
     * 还有一点需要注意：如果通过set方法注入属性，那么spring会通过默认的空参构造方法来实例化对象，
     * 所以如果在类中写了一个带有参数的构造方法，一定要把空参数的构造方法写上，否则spring没有办法实例化对象，导致报错。
     */
    public InjectionServiceImpl() {
    }

    //构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO1) {
        this.injectionDAO = injectionDAO1;
    }

    //设值注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {
        //模拟业务操作
        log.info("=============Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }

}
