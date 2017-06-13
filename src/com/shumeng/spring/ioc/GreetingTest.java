package com.shumeng.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

	@Test
	public void test1() {
		ApplicationContext acx=new ClassPathXmlApplicationContext("springioctest.xml");
//		GreetingService greetingService = (GreetingService)acx.getBean("grettingServiceImpl");
//		greetingService.say();
	}

}
