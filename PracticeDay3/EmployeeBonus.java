package PracticeDay3;
import java.util.Scanner;
public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the experience you have in years");
		float exp = sc.nextFloat();
		System.out.println("what is the rating for your performance from  1 to 10 ");
		int rate = sc.nextInt();
		float salary = 100000f;	
		float bonus =0;
		if (exp>2 && rate>=8) {
			 bonus = salary*0.4f;
			System.out.println("bonus amt is "+(bonus)+"total salary is "+(bonus+salary));
		}
		else {
			System.out.println("you are not eligible for bonus");
		}

	}

}
