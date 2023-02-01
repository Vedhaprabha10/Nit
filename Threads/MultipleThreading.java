package com.Threads;

class Hi extends Thread {
	public void run() {
		for (int i = 1; i<=5; i++) {
			System.out.println("Hi");
//			try {Thread.yield();} catch (Exception e) {}
			try {Thread.sleep(500);} catch (Exception e) {}	
		}
	}
}
class Hello extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {Thread.yield();} catch (Exception e) {}										
			try {Thread.sleep(500);} catch (Exception e) {}									
		}
	}
}
class Fine extends Thread {
	public void run() {
		for (int i = 1; i<=5; i++) {
			System.out.println("virat");
			try {Thread.sleep(10);} catch (Exception e) {}										
		}
	}
}

public class MultipleThreading {

	public static void main(String[] args) {
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		Fine obj3 = new Fine();

		obj1.start();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		obj2.start();
		obj3.start();
	}

}
