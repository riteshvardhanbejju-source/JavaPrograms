package core.Collections;

import java.util.ArrayList;

public class SampleArrrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(40);
		al.add(12);
		al.add(34);
		al.add(8);
		System.out.println(al);
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(23);
		al2.add(3);
		al2.add(34);
		al2.add(4);
		al2.add(12);
		
		al.retainAll(al2);
		System.out.println(al);
		
		int sum=0;
		for (int num:al) {
			sum=sum+num;
		}
		System.out.println(sum);

		
	}

}
