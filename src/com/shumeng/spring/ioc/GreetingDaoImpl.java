package com.shumeng.spring.ioc;

public class GreetingDaoImpl implements GreetingDao {
	public String say;
	public String eat;
	
	public GreetingDaoImpl(String say, String eat) {
		super();
		this.say = say;
		this.eat = eat;
	}
//	public void setSay(String say) {
//		this.say = say;
//	}
//	public void setEat(String eat) {
//		this.eat = eat;
//	}

	@Override
	public void say() {
		System.out.println(this.say+"===================");
	}

	@Override
	public void eat() {
		System.out.println("Eat:"+this.eat+"===================");
	}

}
