package TimePass;

public class ACROnym {

	public static void main(String[] args) {
		String str = "hyper text markup language";
		
		String[] words = str.split(" ");
		String result =""; 
		
		for(int i=0;i<words.length;i++) {
//			String one = words[i];
			
//			one = one.substring(0,1).toUpperCase();
			result=result+words[i].substring(0,1).toUpperCase();
			
//			words[i]=one;
		}
		System.out.println(result);
	}

}
