package List;

import java.util.*;

public class SetToList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); //  List to Set
		list.add(10);
		list.add(16);
		System.out.println("list :" + list);

		Set<Integer> s = new HashSet<Integer>(list);
		System.out.println("Set :" + s);

		System.out.println("---------------------------------");

		Set<Integer> s1 = new HashSet<>();			// Set to List
		s1.add(26);
		s1.add(10);
		System.out.println("Set :" + s1);

		List<Integer> list1 = new ArrayList<Integer>(s1);
		System.out.println("List :" + list1);
		
		System.out.println("---------------------------------");
		
		
		
	}
}
