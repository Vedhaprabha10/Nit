package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {

	public static void main(String[] args) {
		Collection<Integer> values =new ArrayList<Integer>();
		values.add(99);
		values.add(88);
		values.add(77);

		
		Iterator<Integer> it =values.iterator();
		while (it.hasNext())
		System.out.println(it.next());
		

	}

}
