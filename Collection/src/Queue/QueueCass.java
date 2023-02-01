package Queue;

import java.util.*;

public class QueueCass {
	public static void main(String[] args) {
		//Queue<String> q = new LinkedList<>();
		PriorityQueue<String> q=new PriorityQueue<>();
		q.add("Lords");
		q.add("oval");
		q.add("Sydne");
		q.add("lords");
		q.add("ackland");
		q.add("chinnasamy");
		
		System.out.println("Head is " + q.peek());
		System.out.println("removed " + q.remove());
		System.out.println("Head is " + q.peek());
		System.out.println("removed " + q.remove());
		System.out.println("Head is " + q.peek());
		System.out.println("removed " + q.remove());
		System.out.println("Head is " + q.peek());
		System.out.println("removed " + q.remove());
		System.out.println("Head is " + q.peek());
		System.out.println("removed " + q.remove());
		System.out.println("Head is " + q.peek());
		
		System.out.println("size of queue " + q.size());
	}

}
