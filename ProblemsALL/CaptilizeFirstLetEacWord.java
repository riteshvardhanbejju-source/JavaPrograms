package ProblemsALL;

public class CaptilizeFirstLetEacWord {

	public static void main(String[] args) {
		String str = "there was a fully furnished flat in banjarahills main road";
		
		String[] arr = str.split(" ");
		
		for (int i=0;i<arr.length;i++) {
			String ss = arr[i];
			ss=ss.substring(0, 1).toUpperCase() + ss.substring(1);
			
			System.out.print(ss+" ");
		}
	}

}
