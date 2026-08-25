package core.String;
import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string");
		String one=sc.nextLine();
		System.out.println("enter the second string");
		String two = sc.nextLine();
		
		if(one.length()==two.length()) {
			System.out.println(one.concat(two));
		}else if (one.length()>two.length()){
			String str = one.substring(0,two.length());
			System.out.println(str.concat(two));
		}else {
			System.out.println(one.concat(two.substring(0,one.length())));
		}
	}
}
