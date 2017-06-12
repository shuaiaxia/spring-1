package com.shumeng.spring.com;

public class Student {
	private String name;
	
	
	public Student() {
		super();
		System.out.println("Student Constructor...");
		
	}
	public void setName(String name){
		System.out.println("name="+name);
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void play(){
		System.out.println("name:"+name);
	}
}
