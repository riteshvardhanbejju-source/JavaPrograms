package TimePass;

import java.util.HashMap;

public class FREQ {

	public static void main(String[] args) {
		String sent = "python is easy comparing to java python is much better but dont compare them comparing dont give anything";
		String[] word = sent.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String st:word) {
			if(hm.containsKey(st)) {
				hm.put(st,hm.get(st)+1);
			}else {
				hm.put(st, 1);
			}
		}
		System.out.println(hm);
	}

}
