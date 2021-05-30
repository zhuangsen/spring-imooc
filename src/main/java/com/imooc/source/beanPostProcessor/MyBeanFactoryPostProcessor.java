package com.imooc.source.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * bean工厂后置处理器—>构造方法—>init-method。
 *
 * @author madison
 * @description
 * @date 2021/5/28 18:16
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("******调用BeanFactoryPostProcessor开始");
        //获取到Spring中所有的beanName
        String[] beanStr = beanFactory.getBeanDefinitionNames();
        //循环bean做出自定义的操作
        for (String beanName : beanStr) {
            System.out.println("bean name:" + beanName);
            if ("user".equals(beanName)) {
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
                System.out.println("修改user的age值:age=20");
                beanDefinition.getPropertyValues().add("age", "20");
            }
        }
        System.out.println("******调用BeanFactoryPostProcessor结束");
    }
}
