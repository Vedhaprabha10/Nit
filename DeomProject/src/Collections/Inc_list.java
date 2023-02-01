package Collections;


import java.util.*;

public class Inc_list {

	public static void main(String[] args) {
		List<String> alist = new ArrayList<>(Arrays.asList("full","half"));

		alist.add("red");
		alist.add("blue");
		alist.add("orange");
		alist.add("voilet");
		System.out.println("alist : " + alist);
		
		//alist.ensureCapacity(8);
		alist.add("100");
		alist.add("120");
		System.out.println("added array :"+alist);
		
		System.out.println(alist.get(3));
	} 

}
