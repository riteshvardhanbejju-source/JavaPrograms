package TimePass;

public class CApitAliZE {

	public static void main(String[] args) {
		String a = "java is an ocean where thousands of useless pirates sail on";
		
		String[] words = a.split(" ");
		String total=" ";
		for(int i=0;i<words.length;i++) {
			String r = words[i].substring(0, 1).toUpperCase();
			 total = total+r+words[i].substring(1)+" ";
		}
		System.out.println(total);
		
	}

}
