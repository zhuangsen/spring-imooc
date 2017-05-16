package com.imooc.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.beanannotation.multibean.BeanInvoker;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestMultiBean extends UnitTestBase {

	public TestMultiBean() {
		super("classpath:spring-beanannotation.xml");
	}

	@Test
	public void testMultiBean() {
		BeanInvoker invoker = super.getBean("beanInvoker");
		invoker.say();
	}
}
