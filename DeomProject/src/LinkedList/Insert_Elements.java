package LinkedList;

import java.util.*;

public class Insert_Elements {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70));
				
		l.add(0, 80);
		l.add(1, 90);					//to insert the element to spicified position	
		//l.offerFirst(100);			//to input element in first position
		l.offerLast(101);				//to input element in last position
		
		//System.out.println(l);
		
		//System.out.println("The first element : "+l.getFirst());	//to get the first element
	//	System.out.println("The last element : "+l.getLast());		//to get the last element
		
		//for(int i:l)
		//System.out.println(i);
		for (int i=0;i<l.get(i);i++) 
		System.out.println("element at index "+i+": "+l.get(i));		//to get the index of the element

		
		
	}

}
