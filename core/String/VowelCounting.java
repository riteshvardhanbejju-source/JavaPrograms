package core.String;

import java.util.Scanner;

class counting{
	String aa;
	int count;
	public void words() {
		
		String a = aa.toLowerCase();
		char[] c = a.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				count=count+1;
			}
		}
		System.out.println(count);
	}
}
public class VowelCounting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		counting cc = new counting();
		System.out.println("enter a string");
		cc.aa = sc.nextLine();
		cc.words();
	}

}
