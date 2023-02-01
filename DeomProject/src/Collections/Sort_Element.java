package Collections;

import java.util.*;
public class Sort_Element {

	public static void main(String[] args) {
	
		ArrayList<String> alist = new ArrayList<>();

		alist.add("red");
		alist.add("blue");
		alist.add("orange");
		alist.add("voilet");

		System.out.println("list before sort : "+alist);
		
		Collections.sort(alist);				//to sort the list of elements
		System.out.println("list after sort : "+alist);

		
	}

}
