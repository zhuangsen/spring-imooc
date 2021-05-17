package com.imooc.test.aware;

//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.test.base.UnitTestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

//@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
    private static Logger log = LogManager.getLogger();
//	Log log = LogFactory.getLog(this.getClass());

    public TestAware() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void testMoocApplicationContext() {
        log.info("----------testMoocApplicationContext : " + super.getBean("moocApplicationContext").hashCode());
    }

    @Test
    public void textMoocBeanName() {
        log.info("----------testMoocBeanName : " + super.getBean("moocBeanName").hashCode());
    }
}
