package ProblemsALL;

public class LOngestinsentence {

	public static void main(String[] args) {
		String str = "there was a fully furnished flat in banjarahills main road";
		
		String[] words = str.split(" ");
		
		String longest = "";
		
		for(int i=0;i<words.length;i++) {
			if(words[i].length()>longest.length()) {
				longest = words[i];
			}
		}
		System.out.println(longest);
	}

}
