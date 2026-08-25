package core.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> hs = new TreeSet<Integer>();
		hs.add(18);
		hs.add(19);
		hs.add(8);
		hs.add(1);
		hs.add(5);
		hs.add(9);
		hs.add(12);
		hs.add(16);
		hs.add(19);
		System.out.println(hs);
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===================reverse===================");
		Iterator<Integer> itr2 =hs.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println(hs.headSet(9,true));
		System.out.println(hs.tailSet(9,false));
		System.out.println(hs.subSet(5,false,18,true));
		} 

}
