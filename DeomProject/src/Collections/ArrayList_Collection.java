package Collections;

import java.util.*;

public class ArrayList_Collection {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();

		alist.add("red");
		alist.add("blue");
		alist.add("orange");
		alist.add("voilet");

		// System.out.println(alist);

		alist.add(0, "yellow"); // to print String in the first index of the list
		alist.set(1, "Black"); // to replace the element with using 'set' command
		// alist.add(5, "white"); //to print String in the fifth index of the list

		// alist.remove(3); // to remove the element in list by given index number
		//System.out.println(alist);

		// String element= alist.get(0); //to print first element in the arraylist
		// System.out.println("First element :"+element);

		// element= alist.get(3); //to print third element in the arraylist
		// System.out.println("Second element :"+ element);

//		for (String i : alist)
//			System.out.println(i);
		
//		if (alist.contains("black"))			//to find the element if it is present or not
//		{
//			System.out.println("Found a element");
//		}else
//		{
//			System.out.println("there is no element");
//		}

		Collections.sort(alist);
		
	}

}
