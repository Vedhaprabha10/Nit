package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayCollection {


	public static void main(String[] args) 
	{	
		ArrayList<Integer> alist = new ArrayList<Integer>();	//supports redudancy
		
		for (int i=1;i<=10;i++)
			alist.add(i);
		alist.add(100);
		alist.set(0, 10);					// to update a array with using .set
	

		System.out.println(alist);
		for (int i:alist)
			System.out.println(i);
		
	}

}
