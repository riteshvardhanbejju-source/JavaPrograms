package core.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(104, "java");
		hm.put(1, "javaScript");
		hm.put(10, "java");
		hm.put(45, "HTML");
		hm.put(23, "CSS");
		hm.put(6, "Python");
		hm.put(6, "Devops");//if key is repeated the old value is overrides with new value
		System.out.println(hm);
		System.out.println(hm.entrySet());
		
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+"-"+m.getValue());
		}
	}

}
