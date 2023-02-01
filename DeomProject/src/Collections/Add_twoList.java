package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Add_twoList {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();

		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);
		
		System.out.println("list1 : "+alist);
		
		ArrayList<Integer> alist1 = new ArrayList<>();

		
		alist1.add(28);
		alist1.add(26);
		alist1.add(10);
		alist1.add(16);
		Collections.sort(alist1);
		 System.out.println("list2 : "+alist1);

		 ArrayList<Integer> ls=new ArrayList<>();
		 ls.addAll(alist);		
		 ls.addAll(alist1);
		 System.out.println("Added two list : "+ls);		//to add two arraylist
	}

}
