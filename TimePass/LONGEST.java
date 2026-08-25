package TimePass;

public class LONGEST {

	public static void main(String[] args) {
		String str1 ="there was a cat in the town its name was ubemubemosasss";
		
		String[] words = str1.split(" ");
		
		String longest = "";
		for( int i=0;i<words.length;i++) {
			if(words[i].length()>longest.length()) {
				longest=words[i];
			}
		}
		System.out.println(longest);
	}

}
