package TimePass;

public class CAPEVERYFIRST {

	public static void main(String[] args) {
		String str = "at first my name was tiger after it changed to bengal tiger";
		
		String[] word = str.split(" ");
		
		for(int i=0;i<word.length;i++) {
			String one = word[i];
			
			one = one.substring(0,1).toUpperCase()+one.substring(1);
			
			word[i]=one;
		}
		String result = String.join(" ", word);
		System.out.println(result);
	}

}
