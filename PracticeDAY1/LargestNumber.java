package PracticeDAY1;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		float num1 = sc.nextFloat();
		System.out.println("enter second number");
		float num2 = sc.nextFloat();
		float num3 = (num1>num2)?num1:num2;
		System.out.println("the greatest number is - "+num3);
		
		


	}

}
