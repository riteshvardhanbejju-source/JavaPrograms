package TimePass;

public class AcroNYMM {

	public static void main(String[] args) {
		String a = "hyper text markup language";
		
		String[] words = a.split(" ");
		String res = "";
		for(int i=0;i<words.length;i++) {
			 res=res+words[i].substring(0, 1).toUpperCase();
		}
		System.out.println(res);
	}

}
