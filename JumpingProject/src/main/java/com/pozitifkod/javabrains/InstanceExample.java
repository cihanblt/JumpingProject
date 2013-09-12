package com.pozitifkod.javabrains;

public class InstanceExample {
	private static InstanceExample instance = null;
	
	public static InstanceExample getInstance(){
		return instance = new InstanceExample();
	}
	public void getExam(){
		System.out.println("getExam method");
	}
	public void getMyMethod(){
		System.out.println("getMyMethod exam");
	}
}
