package PracticeDay3;
import java.util.Scanner;
public class MovieTicketDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		float ticket = 250f;
		if (age<=18) {
			System.out.println("you are a minor, so you got discount of 10% "+(250-25)+"₹"+" from ₹"+ticket);
		}
		else if(age>18 && age<25) {
			System.out.println("You are are an adult, so you discount of 15% "+(250-37.50)+"₹"+" from ₹"+ticket);
		}
		else if(age>25) {
			System.out.println("You are are an Senior citizen, so you discount of 30% "+(250-75)+"₹"+" from ₹"+ticket);
		}
		
	}

}
