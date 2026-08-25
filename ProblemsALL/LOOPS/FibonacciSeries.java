package ProblemsALL.LOOPS;
import java.util.Scanner;

class series{
	public void calc(int num) {
		int a=0;
		int b=1;
		for (int i=1;i<=num;i++) {
			System.out.println(a +" ");
			int c = a+b;
			a=b;
			b=c;
		}
	}
}
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=sc.nextInt();
		series ss = new series();
		ss.calc(limit);
	}

}
