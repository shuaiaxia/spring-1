package com.shumeng.spring.com;

public class Car {
	
	private String dizhi;
	private int price;
	private double danjia;
	public Car(String dizhi, int price) {
		super();
		this.dizhi = dizhi;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [dizhi=" + dizhi + ", price=" + price + ", danjia=" + danjia + "]";
	}
	public void say(){
		System.out.println("hello");
	}
}
