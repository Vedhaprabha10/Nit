package com.UserInput;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		String s1="vedha";
		int n=10;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		s1 = sc.next();
		n=sc.nextInt();
		System.out.println("The name is - "+ s1);
		System.out.println("Rollno is - "+n);
	}

}
