package TimePass;

public class ANAGRAM2 {

	public static void main(String[] args) {
		String st1 ="listen";
		String st2 ="silene";
		
		if(st1.length()!=st2.length()) {
			System.out.println("not an anagram");
		}
		
		char[] arr = st2.toCharArray();
		
		for(int i=0;i<st1.length();i++) {
			
			char ch=st1.charAt(i);
			boolean present=false;
			
			for(int j=0;j<st1.length();j++) {
				if(arr[j]==ch) {
				present=true;
				break;
				}
			}
			if(!present) {
			System.out.println("not anagram");
			return;
			}
		}
		System.out.println("anagram");
		
	}

}
