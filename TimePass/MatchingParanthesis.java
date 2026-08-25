package TimePass;

import java.util.Scanner;

class match{
	public void paran(String str) {
		int count = 0;
		boolean matching = true;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch == '(') {
				count++;
			}
			if(ch == ')') {
				count--;
			}
		}
		if(count!=0) {
			System.out.println("not equal");
		}else {
			System.out.println("equal");
		}
	}
}
public class MatchingParanthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		match mh = new match();
		System.out.println("enter the paranthasis");
		mh.paran(sc.nextLine());
	}

}
