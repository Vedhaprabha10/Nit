package Collections;

import java.util.*;

public class Copy_elements {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();

		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		System.out.println("list1 : "+alist);
		
		ArrayList<Integer> alist2 = new ArrayList<>();

		alist2.add(60);
		alist2.add(70);
		alist2.add(80);
		alist2.add(90);
		alist2.add(100);

		System.out.println("list2 : "+alist2);

		Collections.copy(alist2, alist);			//to copy the elements one array to another
		System.out.println("Copy alist to alist2 \n after copy");
		System.out.println("alist : "+alist);
		System.out.println("alist2 : "+alist2);
	}

}
