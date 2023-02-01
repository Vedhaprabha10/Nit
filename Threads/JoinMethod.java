package com.Threads;
class ClassA extends Thread
{
	public void run() {
		for (int i = 1; i <= 5; i++) {
		//try{Thread.sleep(1000);}catch (Exception e){}
			
		
			System.out.println("hello");
		}
	}
}
class ClassB extends Thread
{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			//try{Thread.sleep(1000);}catch (Exception e){}
		
			System.out.println("Vanakam");
		}
	}
}
class ClassC extends Thread
{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			//try{Thread.sleep();}catch (Exception e){}
		
			System.out.println("namasthai");
		}
	}
}
public class JoinMethod {

	public static void main(String[] args) {
		ClassA obj=new ClassA();
		ClassB obj2=new ClassB();
		ClassC obj3=new ClassC();
		
		obj.start();
		obj3.start();
		obj2.start();
	}

}
