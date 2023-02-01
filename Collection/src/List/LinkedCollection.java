package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedCollection {

	public static void main(String[] args) {
		LinkedList<Integer> alist = new LinkedList<Integer>();
		for (int i = 1; i <= 15; i++)
			alist.add(i);
		System.out.println(alist);
		alist.add(20);
		alist.add(30);
		System.out.println("---------------------------");
		for (int i : alist)
			System.out.println(i);
			
	}

}
