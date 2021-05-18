package com.imooc.test.ioc.interfaces;

//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.ioc.factory.Person;
import com.imooc.ioc.injection.service.InjectionService;
import com.imooc.test.base.UnitTestBase;
import org.junit.jupiter.api.Test;

//@RunWith(BlockJUnit4ClassRunner.class)
public class TestFactory extends UnitTestBase {

    public TestFactory() {
        super("classpath:spring-ioc-factory.xml");
    }

    @Test
    public void testFactory() {
        // 静态工作
        Person person = super.getBean("person1");
        System.out.println(person.getName());
        System.out.println(person);

        // 实例工厂
        Person person2 = super.getBean("person2");
        System.out.println(person2.getName());
        System.out.println(person2);

        // 通过FactoryBean
        Person person3 = super.getBean("person3");
        System.out.println(person3.getName());
        System.out.println(person3);
    }
}