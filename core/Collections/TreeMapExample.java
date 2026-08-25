package core.Collections;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
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
