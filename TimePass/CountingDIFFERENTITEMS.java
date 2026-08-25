package TimePass;

public class CountingDIFFERENTITEMS {

	public static void main(String[] args) {
		String str = "Ritesh123@gmail.com";
		str = str.toLowerCase();
		
		int vowels = 0;
		int consonents = 0;
		int special = 0;
		int digits = 0;
	
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			}else if(ch>='a' && ch<='z') {
				consonents++;
			}
			else if(ch>='0' && ch<='9') {
				digits++;
			}
			else {
				special++;
			}
		}
		System.out.println("vowels----"+vowels);
		System.out.println("consonents----"+consonents);
		System.out.println("special----"+special);
		System.out.println("digits----"+digits);
		
		
	}

}
