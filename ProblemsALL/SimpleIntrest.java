package ProblemsALL;
import java.util.Scanner;

class intrest{
	double principle_amount;
	double rate_of_intrest;
	int time;
	public double calculate() {
		double SI =  (principle_amount*rate_of_intrest*time)/100;
		return SI;
	}	
}
public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		intrest it = new intrest();
		System.out.println("enter principle amount");
		it.principle_amount = sc.nextDouble();
		System.out.println("enter rate of intrest");
		it.rate_of_intrest = sc.nextDouble();
		System.out.println("enter the time in years");
		it.time = sc.nextInt();
		System.out.println(it.calculate());
	}

}
