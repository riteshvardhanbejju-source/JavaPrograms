package ExceptionHandling;

public class NestedTRYblock {

	public static void main(String[] args) {
		try {
			try {
				int a,b,c;
				a=35;
				b=0;
				c=a/b;
				System.out.println(c);
			}
			catch(ArithmeticException aew) {
				System.out.println(aew);
			}
			try {
				int ar[]= {4,5,6,4,34,3};
				System.out.println(ar[12]);
			}
			catch(ArrayIndexOutOfBoundsException aie) {
				System.out.println(aie);
			}
		}catch(Exception ee) {
			System.out.println(ee);
		}
	}
}
