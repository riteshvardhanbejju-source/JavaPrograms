package core.Collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(60);
		pq.add(30);
		pq.add(20);
		pq.add(50);
		pq.add(40);
		System.out.println(pq);
		
		// when poll() is used its sorts from lowest to highest as its priority.
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
			
			/*
			 *the output of Systrm.out.println(pq) is not fully sorted because
			 *    priority Queue is implemented using *heap*.
			 *    the elements come out in sorted order only when removed using poll() 
			 */
		}
	}

}
