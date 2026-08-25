package ExceptionHandling;

public class ThrowsExample {
	public static void divide(int a,int b) throws ArithmeticException
	{
		if(b<=0)
		{
			throw new ArithmeticException("b cannot be zero");
		}
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		try {
			divide(14,0);
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
	}

}
