package core.String;

import java.util.Scanner;

class palindromee{
	static String strr;
	public static boolean task(String name) {
		strr=name;
		if (strr==null) {
			return false;
		}
		boolean res=true;
		StringBuffer sb = new StringBuffer(strr);
		sb.reverse();
		String reversed = sb.toString();
		
		 res = strr.equalsIgnoreCase(reversed);
		
		 return res;
	}
}

public class StringBufferTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String name = sc.nextLine();
		Boolean result = palindromee.task(name);
		
		System.out.println(result);
		
	}

}
