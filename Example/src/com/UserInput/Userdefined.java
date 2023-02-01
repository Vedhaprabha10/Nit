package com.UserInput;

public class Userdefined {

	public static void main(String[] args) {
int i,j;
i=8;
j=9;
try
{
	 int k=i/j;
		if (k==0) 
			throw new ViratException("this is not good");
		System.out.println(k);
}	catch (Exception e) {
	System.out.println("Error "+e.getMessage());
}
		}
		
}