package com.Threads;

class Zero extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 3; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.err.println("thread get's error");
		}

	}
}

public class InterruptMethod {

	public static void main(String[] args) {
		Zero t1 = new Zero();
		t1.start();
		t1.interrupt();
	}

}
