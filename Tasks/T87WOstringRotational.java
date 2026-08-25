package Tasks;

public class T87WOstringRotational {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "bacd";
		
		String combo = str1+str1;
		
		if(str1.length()==str2.length()) {
			if(combo.contains(str2)) {
				System.out.println("rotational");
			}
			else {
				System.out.println("not rotational");
		}
		}
	}

}
