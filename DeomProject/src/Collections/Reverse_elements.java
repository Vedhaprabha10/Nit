package Collections;

import java.util.ArrayList;					
import java.util.Collections;

public class Reverse_elements {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();

		alist.add("red");
		alist.add("blue");
		alist.add("orange");
		alist.add("voilet");

		System.out.println("before reverse : "+alist);
		Collections.reverse(alist);					// to reverse the array list
		System.out.println("after reverse : "+alist);
	}

}
