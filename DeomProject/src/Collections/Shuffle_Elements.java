package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_Elements {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();

		alist.add("red");
		alist.add("blue");
		alist.add("orange");
		alist.add("voilet");

		System.out.println("before shuffle : "+alist);
		Collections.shuffle(alist);					//to shuffle the array list 
		System.out.println("after shuffle : "+alist);

	}

}
