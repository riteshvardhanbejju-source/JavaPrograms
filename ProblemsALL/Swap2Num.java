package ProblemsALL;
import java.util.Scanner;

class Swap{
	public void Numbers(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
	}
}




public class Swap2Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Swap sp = new Swap();
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		
		System.out.println("before swaping");
		System.out.println("first number " + num1);
		System.out.println("second number " + num2);
		
		sp.Numbers(num1, num2);
		
		System.out.println("after swaping");
		System.out.println("first number " + num1);
		System.out.println("second number " + num2);
	}

}
