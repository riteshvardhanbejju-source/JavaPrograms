package core.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class To_add_ALL_Item_To_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(Arrays.asList("java","python","HTML","CSS"));
		
		System.out.println(al);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.addAll(Arrays.asList(2,3,4,5,6,6,5,4));
		
		System.out.println(al2);
	}

}
