package PracticeDay3;
import java.util.Scanner;
public class ElectricityCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total amount of units used");
		float units = sc.nextFloat();
		
		if (units<=100) {
			float total = (100*5);
			System.out.println("total bill is "+total);
		}
		else if (units>100 && units<=200) {
			float total = (100*5)+((units-100)*7);
			System.out.println("total bill is "+total);
		}
		else if (units>200) {
			float total = (100*5)+(100*7)+((units-200)*10);
			System.out.println("total bill is "+total);

		}
	}

}
