package com.imooc.test.beanPostProcessor;

import com.imooc.source.beanPostProcessor.User;
import com.imooc.test.base.UnitTestBase;
import org.junit.jupiter.api.Test;

/**
 * @author madison
 * @description
 * @date 2021/5/28 18:20
 */
public class TestBeanPostProcessor extends UnitTestBase {

    public TestBeanPostProcessor() {
        super("classpath*:spring-beanpostprocessor.xml");
    }

    @Test
    public void testBeanPostFactory() {
        User user = super.getBean("user");
        user.go();
    }

    @Test
    public void testBeanPostPro() {
        User user = super.getBean("user");
        user.go();
    }
}
