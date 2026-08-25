package PracticeDay3;
import java.util.Scanner;
public class OnlineShopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total amount purchased");
		float total = sc.nextFloat();
		System.out.println("type 1 if you are a premium member  or 2 if you are not");
		int check=sc.nextInt();
		
		
		if (total>=5000 && check==1) {
		System.out.println("you got a gift hamper worth ₹1500");
		}
		else if ( check==2) {
			System.out.println("you are not eligible for price or discount due to YOU ARE NOT PREMIUM MEMBER");
		}
		else if (total<5000 ) {
			System.out.println("you are not eligible for price or discount due to PURCHASE REQUIREMENT NOT MET");
		}
	}

}
