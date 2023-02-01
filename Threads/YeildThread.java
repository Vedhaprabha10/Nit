package com.Threads;

class Something extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
	}
}
class Something2 extends Thread {
	public void run() 
	{
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
	}
}
public class YeildThread {

	public static void main(String[] args)  {
		Something t1 = new Something();
		Something2 t2 = new Something2();

		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
		System.out.println("hello");
	}
}
