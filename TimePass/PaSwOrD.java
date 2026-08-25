package TimePass;

import java.util.Scanner;

public class PaSwOrD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password");
		String pass = sc.nextLine();
		
		boolean upper=false;
		boolean lower=false;
		boolean digit=false;
		boolean special=false;
		
		for(int i=0;i<pass.length();i++) {
			
			char ch = pass.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upper=true;
			}
			else if(Character.isLowerCase(ch)) {
				upper=true;
			}
			else if(Character.isDigit(ch)) {
				upper=true;
			}
			else{
				upper=true;
			}
		}
		
	}

}
