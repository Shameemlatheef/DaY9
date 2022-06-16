package com.Day9;



final class Child extends Parent {
	public Child(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void method1() {
		System.out.println("method1 in child");
	}
	@Override
	public void method3() {
		System.out.println("inside child method3");
	}
public void method4() {
	System.out.println("method4 in child");
}

}
