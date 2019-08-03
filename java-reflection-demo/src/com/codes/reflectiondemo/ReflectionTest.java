package com.codes.reflectiondemo;

public class ReflectionTest {
	
	String str;
	public ReflectionTest() {
		this.str = "Reflection Test!";
	}
	
	public void firstMethod() {
		System.out.println("The String is " + str);
	}
	
	public void secondMethod(int number) {
		System.out.println("The number given is " + number);
	}

	private void privateMethod() {
		System.out.println("private method invoked!");
	}
}
