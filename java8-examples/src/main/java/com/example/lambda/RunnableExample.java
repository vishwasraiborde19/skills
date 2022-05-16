package com.example.lambda;

public class RunnableExample {
	
	public static void main(String args[]) {
		
		/*
		 * OO style
		 * **/
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread start 1");
				
			}
		});
		thread.start();
		
		
		/*
		 * Functional style
		 * **/
		
		 new Thread(()-> System.out.println("thread sart 2")).start();		
	}

}
