package com.imooc.test.beanscope;

//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.beanscope.BeanScope;
import com.imooc.test.base.UnitTestBase;
import org.junit.jupiter.api.Test;

/**
 * 1）singleton （单一实例）
 * 2）prototype
 * 3）request
 *
 * 4）session
 *      对于web应用来说，放到session中最普遍的就是用户的登录信息，对于这种放到session中的信息，我们可以使用如下形式的制定scope为session：
 *      <bean id ="userPreferences" class="...UserPreferences"   scope="session" />
 *      Spring容器会为每个独立的session创建属于自己的全新的UserPreferences实例，比request scope的bean会存活更长的时间，其他的方面没区别，
 *      如果java web中session的生命周期。
 *
 * 5）global session
 *      global session只有应用在基于porlet的web应用程序中才有意义，它映射到porlet的global范围的session，
 *      如果普通的servlet的web 应用中使用了这个scope，容器会把它作为普通的session的scope对待。
 */
//@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {

    public TestBeanScope() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }

    @Test
    public void testSay2() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();
    }

}
