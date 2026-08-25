package ProblemsALL;

public class CleanANdCount {

	public static void main(String[] args) {
		String str = "there was a fox living in a forest";
		String neww = str.replaceAll(" ", "");
		System.out.println(neww +"length = "+neww.length());
		
		char[] arr = neww.toCharArray();
			int count=0;
		for (int i=0;i<arr.length;i++) {
			count++;
		}
		System.out.println(count);
	}
		
}


