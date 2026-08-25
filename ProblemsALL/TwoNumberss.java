package ProblemsALL;
import java.util.Scanner;

class numbbers {
	public void just(int a,int b) {
		System.out.println("first number is - "+ a);
		System.out.println("second number is - "+ b);
	}
}




public class TwoNumberss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		numbbers nb = new numbbers();
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		nb.just(a, b);
		
	}

}
