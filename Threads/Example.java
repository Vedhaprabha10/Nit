package com.Threads;

class One implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("HI");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

class Two implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Lucy");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}

public class Example {
	public static void main(String[] args) {
		One obj1 = new One();
		Two obj2 = new Two();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();
	}
}
