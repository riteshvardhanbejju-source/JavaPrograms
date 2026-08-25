package TimePass;

public class LonGESTWorD {

	public static void main(String[] args) {
		String a = "java is an ocean where thousands of useless pirates sail on";
		
		String[] words = a.split(" ");
		
		String longest="";
		
		for(int i =0;i<words.length;i++) {
			if(words[i].length()>longest.length()) {
				longest=words[i];
			}else {
				longest=longest;
			}
		}
		System.out.println(longest);
	}

}
