package TimePass;

import java.util.HashMap;

public class FREquency {

	public static void main(String[] args) {
		String str = "java is good java is powerfull";
		
		String[] arr = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String st:arr) {
			if(hm.containsKey(st)) {
				hm.put(st,hm.get(st)+1);
			}else {
				hm.put(st, 1);
			}
		}
		System.out.println(hm);
	}

}
