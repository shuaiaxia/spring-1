package com.shumeng.spring.ioc;

public class GreetingServiceImpl implements GreetingService {

	private String say;
	@Override
	public void say() {
		System.out.println("�����к��ǣ�"+say);
	}

	public void setSay(String say){
		System.out.println("ʵ�����set����");
		this.say=say;
	}

	public GreetingServiceImpl() {
		super();
		System.out.println("ʵ����Ĺ�����");
	}
	
}
