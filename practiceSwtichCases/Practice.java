package practiceSwtichCases;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("if you are premium number 'true' if not 'false' ");
		boolean premium = sc.nextBoolean();
		System.out.println("select the food items required  1.Burger    3.Pizza");
		int food = sc.nextInt();
		double bill;
		
		switch (food) {
		case 1:{
			if (premium==true) {
				bill=359;
				System.out.println("you got a coke free "+bill);
			}
			else {
				bill=359;
				System.out.println(bill);

			}
		}break;
		case 3:{
			if (premium==true) {
				bill=499;
				System.out.println("you got a coke free "+bill);
			}
			else {
				bill=499;
				System.out.println(bill);
		}
		}	break;
		default: System.out.println("Enter a valid choice");
			
	}

}
}
