package ProblemsALL;
import java.util.Scanner;

class separator{
	public void digit(int num) {
		while(num>0) {
			int digit = num%10;
			System.out.println(digit);
			num=num/10;
		}
	}
}


public class SeparateDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		separator sp = new separator();
		System.out.println("enter a number");
		int num = sc.nextInt();
		sp.digit(num);
	}

}
