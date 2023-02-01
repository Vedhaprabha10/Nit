package Queue;
import java.util.*;
public class Deque_Class {

	public static void main(String[] args) {
		Deque<Integer> q=new LinkedList<>();
		
//		q.add(null);
//		q.add(null);
//		q.add(null);
		
		q.addFirst(10);
		q.addFirst(14);
		
//		q.addLast(null);
//		q.addLast(null);
		
		//q.push(null);	//it inserts the element in first array 
		System.out.println(q.pop());
		System.out.println(q.pop());
		//it removes the first element in queue 
		//q.pollLast();				//it removes the last element in queue
		//System.out.println(q.pop());	//it removes the first element in the 
		
		System.out.println(q);
	}

}
