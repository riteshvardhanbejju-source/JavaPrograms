package core.Collections;

import java.util.ArrayDeque;
//import java.util.Deque;

public class DequeueExample {

	public static void main(String[] args) {
		ArrayDeque<Integer> pq =new ArrayDeque<Integer>();
		pq.add(10);
		pq.add(60);
		pq.add(30);
		pq.add(20);
		pq.add(50);
		pq.add(40);
//		System.out.println(pq);
		
		// when poll() is used its sorts from lowest to highest as its priority.
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
	}

}
}
