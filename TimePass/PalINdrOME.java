package TimePass;

public class PalINdrOME {

	public static void main(String[] args) {
		String a = "Silent";
		String str=a.toLowerCase();
		String rev = "";
	
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
