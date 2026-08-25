package TimePass;

import java.util.Arrays;

public class ANAGRA {

	public static void main(String[] args) {
		String a = "silent";
		String b = "listen";
		
		char[] ch1 = a.toCharArray();
		char[] ch2 = a.toCharArray();
		
		 
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 if(Arrays.equals(ch1, ch2)) {
			 System.out.println("anagram");
		 }else {
			 System.out.println("not an anagram");
		 }
	}

}
