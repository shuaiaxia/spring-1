package com.shumeng.spring.properties.com;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {
	
	
	@Test
	public void test1() throws SQLException{
		ApplicationContext acx=new ClassPathXmlApplicationContext("beans-properties.xml");
		DataSource dataSource=(DataSource) acx.getBean("dataSource");
		
		System.out.println(dataSource.getConnection());
	}
}
