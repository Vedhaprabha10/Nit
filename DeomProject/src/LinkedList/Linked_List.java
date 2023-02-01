package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("40");
		list.add("50");


		Iterator<String> a=list.descendingIterator();		//to start from the given array
	while(a.hasNext())
		System.out.println(a.next());
		
		
	}

}
