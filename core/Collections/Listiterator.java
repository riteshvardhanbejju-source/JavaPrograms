package core.Collections; 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
        // Using Object as the generic type for mixed data
		ArrayList<Object> al = new ArrayList<>(5);
		al.add(101);
		al.add("Aditya");
		al.add('X');
		al.add(1110087.46);
		al.add("How are you?");
		
		System.out.println(al);
		System.out.println("=======================================");
		
		Iterator<Object> itr = al.iterator();
		System.out.print("Forward Iteration: ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+"     ");
		}
		
		System.out.println("\n");
		
		
		// to print reverse:-
		/*
		 while(itr.hasPrevious()) {
			System.out.print(ltr.previous()+"      ");
		}
		 */
		
		// or
		
		
		ListIterator<Object> ltr = al.listIterator(al.size());
		
		System.out.print("Backward Iteration: ");
		while(ltr.hasPrevious()) {
			System.out.print(ltr.previous()+"      ");
		}
	}
}