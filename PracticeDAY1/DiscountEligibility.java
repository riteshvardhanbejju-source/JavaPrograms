package PracticeDAY1;
import java.util.Scanner;
public class DiscountEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the bill amount");
		float total = sc.nextFloat();
		String Dis = (total>5000)?"Discount Available":"No Discount";
		System.out.println(Dis);
	}

}
