package Problems;
import java.util.Scanner;
public class PasswordStrength {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your password");
		String password = s.nextLine();
		boolean upper = false;
		boolean digit = false;
		boolean lower = false;
		if (password.length()<8) {
		System.out.println("atleast password must contain 8 characters");
		}
		for (int i=0;i<password.length();i++) {
			char c = password.charAt(i);
			
			if(Character.isUpperCase(c)) {
				upper=true;
			}
			else if(Character.isLowerCase(c)) {
				lower=true;
			}
			else if (Character.isDigit(c)) {
				digit=true;
			}
		}if(upper==true && lower==true && digit==true) {
			System.out.println("strong password");
		}else if (upper==false || lower==false || digit==false) {
			System.out.println("weak password");
		}
	}

}
