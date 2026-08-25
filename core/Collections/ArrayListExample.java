package core.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(5);
		System.out.println(al.size());
		al.add(101);
		al.add("siri");
		al.add('A');
		al.add(89.343f);
		al.add(2423.232);
		al.add("ritesh");
//		System.out.println(al);
//		System.out.println(al.size());
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("========================================");
		
		ArrayList al2 = new ArrayList(5);
		al2.add('A');
		al2.add('A');
		al2.add(89.343f);
		al2.add(2423.232);
		al.add("ritesh");
		System.out.println("==================================");
		
//		al.addAll(2,al2);
//		System.out.println(al);
		
		
	}

}
