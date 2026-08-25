package TimePass;

public class PyramidNumberPattern {

	public static void main(String[] args) {
		for(int i=4;i>=1;i--) {
			//for spaces
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
//			for numbers
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
