package TimePass;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DuplicATE {

	public static void main(String[] args) {
		String a = "emergency";
		
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
		
		for(int i=0;i<a.length();i++) {
			hm.put(a.charAt(i),i);
		}
		
		String result ="";
		
		for(char chh:hm.keySet()) {
			result = result+chh;
			}
		System.out.println(result);
	}

}
