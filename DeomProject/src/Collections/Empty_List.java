package Collections;

import java.util.ArrayList;
import java.util.List;

public class Empty_List {

	public static void main(String[] args) {
		List<String> alist = new ArrayList<>();

		alist.add("red");
		alist.add("blue");
		alist.add("orange");
		alist.add("voilet");
		
		System.out.println("original arraylist : "+alist);
		System.out.println("Checking for the list is empty or not!"+alist.isEmpty());	//to check arraylist empty 
		
		alist.removeAll(alist);
		System.out.println("after removing elements"+alist);
		System.out.println("checking for list is empty or not!"+alist.isEmpty());	//to check arraylist empty 
	}

}
