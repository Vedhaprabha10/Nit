package SetCollections;

import java.util.*;

public class HashSet1 
{

	
	
	
	public static void main(String[] args) {
	
		
		
		Set set1 = new HashSet<>();
		//Set set1=new TreeSet();
		set1.add(2);
		set1.add(50);
		set1.add(40);
		set1.add(22);

		System.out.println("Set1 is :" + set1);
		System.out.println("---------------------------------");

		Set set2 = new HashSet();
		//Set set2 = new TreeSet();
		set2.add("Rohit");
		set2.add("KL Rahul");
		set2.add("Sky");
		set2.add("Sky");
		System.out.println("Set2 is :" + set2);

		System.out.println("---------------------------------");
		
		set2.addAll(set1);
		System.out.println("Union of set1 & set2 :" + set2);
	
	}

}
