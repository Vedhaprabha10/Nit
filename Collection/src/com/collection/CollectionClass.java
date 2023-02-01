package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {
		List<Integer> values =new ArrayList<Integer>();
		values.add(99);
		values.add(22);
		values.add(77);
		values.add(11);
		values.add(88);
		
		Collections.sort(values);
		
		for (Integer o: values) {
			System.out.println(o);
		}

	}

}
