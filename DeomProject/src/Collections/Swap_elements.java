package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_elements {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();

		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);

		//System.out.println(alist);
		System.out.println("before swapping ");

		for (int i : alist)
		{			
			System.out.println(i);
		}
		Collections.swap(alist, 0, 3);
		System.out.println("After swapping ");
		for (int i : alist) {
			System.out.println(i);
			// System.out.println("after swapping :"+alist);
		}
	}

}
