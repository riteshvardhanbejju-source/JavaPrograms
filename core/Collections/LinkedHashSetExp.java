package core.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExp {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(null);
		hs.add(18);
		hs.add(8);
		hs.add(1);
		hs.add(5);
		hs.add(9);
		hs.add(null);
		hs.add(18);
		hs.add(19);
		hs.add(null);
		System.out.println(hs);
	}

}
