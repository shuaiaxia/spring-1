package com.shumeng.spring.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	public static void main(String[] args) {
//		Student student=new Student();
//		student.setName("Spring");
		//1:
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2:
		Student student=(Student) applicationContext.getBean("student");
		//3:
		student.play();
		
		Car car=(Car) applicationContext.getBean("car");
		System.out.println(car.toString());
	}
}
