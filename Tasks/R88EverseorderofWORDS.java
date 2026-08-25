package Tasks;

public class R88EverseorderofWORDS {

	public static void main(String[] args) {
		String str = "java is programing language";
		
		String[] words = str.split(" ");
		
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
	}

}
