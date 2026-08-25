package PracticeDAY1;
import java.util.Scanner;
public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter First number");
		int num1 = sc.nextInt();
		System.out.println("enter Second number");
		int num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println((num1)+" is greater");
		}else if (num1<num2) {
			System.out.println((num2)+"is greater");
		}else {
			System.out.println("Both numbers are equal");
				
			
		}
	}

}
