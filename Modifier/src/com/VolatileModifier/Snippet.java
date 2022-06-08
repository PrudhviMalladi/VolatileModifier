package com.VolatileModifier;

public class Snippet implements Runnable {
volatile int num =0;
	@Override
	public void run() {
		Thread t =Thread.currentThread();
		String name =t.getName();
		if(name.equals("Thread1")) {
			num =10;
			
		}
		else {
			System.out.println("Value of num is : "+num);
		}
				
		
	}
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new Snippet();
		Thread t1= new Thread(r);
		t1.setName("Thread1");
		t1.start();
		Thread.sleep(1000);
		Thread t2= new Thread(r);
		t2.setName("Thread2");
		t2.start();
		
		
	}
	

}
