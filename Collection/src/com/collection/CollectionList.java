package com.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {
		
		List<Integer>values1=new ArrayList<Integer>();
		values1.add(45);
		values1.add(99);
		values1.add(77);
		values1.add(66);
	

		for (Object o: values1)
		{
			System.out.println(o);
		}
	
	}

}
