package com.example.java;

public class CallStack {
	
	/*
	 * 
	 * */
	
	
	private String call_Method_C(String str) {
		String hello = new String("Hello From C");
		return hello;
	}
	
	private String call_Method_B(String str) {
		String hello = new String("Hello From B");
		hello = call_Method_C(hello);
		return hello;
	}
	
	private String call_Method_A(String str) {
		String hello = new String("Hello From A");
		hello = call_Method_B(hello);
		return hello;
	}
	
	public static void main(String[] args) {
		CallStack callstack = new CallStack();
		String hello = new String("hi");
		 hello = callstack.call_Method_A(hello);
		System.out.println(hello);
		
	}

}
