package com.shumeng.spring.ioc;

public class GreetingServiceImpl implements GreetingService {

	private String say;
	@Override
	public void say() {
		System.out.println("你打的招呼是："+say);
	}

	public void setSay(String say){
		System.out.println("实现类的set方法");
		this.say=say;
	}

	public GreetingServiceImpl() {
		super();
		System.out.println("实现类的构造器");
	}
	
}
