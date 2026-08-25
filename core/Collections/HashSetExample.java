package core.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
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
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.addAll(Arrays.asList(23,8,9,12,34,23,898));
		//adding ArrayList vslues to HashSet-->Removes duplicate value.
		System.out.println(hs.addAll(al2));
		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs.isEmpty());
	}

}
