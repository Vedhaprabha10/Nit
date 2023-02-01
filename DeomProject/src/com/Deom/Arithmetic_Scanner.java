package com.Deom;

import java.util.Scanner;

public class Arithmetic_Scanner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		
		System.out.println("Input first number :");
		int num1=in.nextInt();
		
		System.out.println("Input second number :");
		int num2=in.nextInt();
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		
		System.out.println(num1+"*"+num2+"="+(num1*num2));
		
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		
		System.out.println("Results of Operations");
	}
}
