package core.String;

public class SplitForSpecialSymbols {

	public static void main(String[] args) {
		String str = "java.util.scanner";
		String[] a = str.split("\\.");
		
		System.out.println("\nSplit by dot:");
		for(String s:a) {
			System.out.println(s);
		}
		String str1 = "java|util|scanner";
		String[] aa = str1.split("\\|");
		
		System.out.println("\nSplit by pipe:");
		for(String ss:aa) {
			System.out.println(ss);
		
	}
	}
}
