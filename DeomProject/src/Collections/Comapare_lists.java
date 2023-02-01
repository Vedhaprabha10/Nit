package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comapare_lists {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));

		List<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "S", "E"));

		//l1.removeAll(l2); //to find the different elements in l1
		 //System.out.println(l1);

		//Collections.sort(l2);
		//l2.removeAll(l1); //to find the different elements in l2
		//System.out.println(l2);

		//Collections.sort(l1);
		//System.out.println(l1.equals(l2));		//to get boolean values "true or fales"
		
		Collections.sort(l1);
		l1.retainAll(l2);
		System.out.println(l1);
		
	}

}
