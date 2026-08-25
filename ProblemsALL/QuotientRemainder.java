package ProblemsALL;
import java.util.Scanner;

class find{
	double divisor;
	double dividend;
	public double Quotient() {
		double sol = dividend/divisor;
		return sol;
	}
	public double remainder() {
		double solu = dividend%divisor;
		return solu;
	}
}
public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		find fd = new find();
		System.out.println("enter first number");
		fd.dividend = sc.nextDouble();
		System.out.println("enter second number");
		fd.divisor = sc.nextDouble();
		System.out.println("enter the operator modulus or divisor");
		char choice = sc.next().charAt(0);
		
		switch (choice) {
		case '/' :
			System.out.println(fd.Quotient());
			break;
		case '%':
			System.out.println(fd.remainder());
			break;
		}
	}
}
