package ExceptionHandling;

public class SampleException {

	public static void main(String[] args) {
		int a,b,c;
		try {
			a=12;
			b=5;
			int ar[] = {3,34,34,334,34};
			c=a/b;
			System.out.println(c);
			System.out.println(ar[7]);

		}
		catch(ArithmeticException ee){
			System.out.println("division is not possible with zero "+ee);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("index is out of bound"+ae);
		}
		System.out.println("end of exception");
	}

}
