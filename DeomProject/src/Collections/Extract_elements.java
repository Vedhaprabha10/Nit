package Collections;

import java.util.*;

public class Extract_elements {

	public static void main(String[] args) {
		List<String> alist = new ArrayList<>();

		alist.add("red");
		alist.add("blue");
		alist.add("orange");
		alist.add("voilet");
		
		Iterator i= alist.iterator();
		
		
		while(i.hasNext())		
		System.out.println(i.next());
		//List<String> sub_List = alist.subList(0, 3);			//to extract the elements to describe
		//System.out.println("list of first two elements"+sub_List);
	}

}
