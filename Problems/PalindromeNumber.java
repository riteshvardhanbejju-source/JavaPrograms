package Problems;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 1211;
		String var = Integer.toString(num);
		String vr ="";
		while (num>0) {
			 int digit = num%10;
			 vr=vr+digit;
			 num=num/10;
		}
		if (var.equals(vr)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}
