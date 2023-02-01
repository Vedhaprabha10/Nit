package Collections;

import java.util.Scanner;

public class Scanner_Input 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.println("enter the name : ");
		String name = in.next();

		System.out.println("enter the Clg_name : ");
		String clg_name = in.next();

		System.out.println(name + "-" + clg_name);

	}

}
