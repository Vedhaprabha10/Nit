package com.collection;

import java.util.*;

public class CollectionSet {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
			values.add(10);
			values.add(16);
			values.add(26);
			values.add(34);
			
				
		for(int i : values) {
			System.out.println(i);
		}
	}

}
