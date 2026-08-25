package EXtrapractice;

import java.util.HashMap;

public class CountFREquenCy {

	public static void main(String[] args) {
		String a = "java is an ocean where thousands of useless pirates sail on";
		
		String[] words = a.split(" ");
		
		HashMap<String,Integer> hm= new HashMap<>();
		
		for(int i=0;i<words.length;i++) {
			if(hm.containsKey(words[i])) {
				hm.put(words[i],hm.get(words[i]+1));
			}else {
				hm.put(words[i], 1);
			}
		}
		System.out.print(hm);
	}

}
