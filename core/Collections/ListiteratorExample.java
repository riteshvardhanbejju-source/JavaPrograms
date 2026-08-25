package core.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ListiteratorExample {
	public static void main(String[] args) {
  System.out.println("=============");
   ArrayList al2= new ArrayList(5);
   al2.add(101);
   al2.add("siri");
   al2.add('A');
   al2.add(89.878f);
   al2.add(2134.9999);
  
   ListIterator ltr= al2.listIterator(al2.size());
   
//   while(ltr.hasNext())
//   {
//	   System.out.println(ltr.next());
//   }
   System.out.println("previous");
   while(ltr.hasPrevious())
   {
	   System.out.println(ltr.previous());
   }
  
  
  
	}

}