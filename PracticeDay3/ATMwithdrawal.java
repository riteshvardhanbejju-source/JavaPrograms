package PracticeDay3;
import java.util.Scanner;
public class ATMwithdrawal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total amount in bank");
		float Balance = sc.nextFloat();
		System.out.println("enter the amount to withdraw");
		int amount = sc.nextInt();
		
		if (amount%100==0) {
			if((Balance-amount)>1000) {
				System.out.println("withdrawal allowed of ₹"+amount);
			}
			else {
				System.out.println("Enter lesser amount");

			}
		}
		else {
			System.out.println("amount cannot be debited");
		}
				
		
	}

}
