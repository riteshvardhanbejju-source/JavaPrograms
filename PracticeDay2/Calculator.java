package PracticeDay2;
import java.util.Scanner;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("enter the first number: ");
		int num2 = sc.nextInt();
		System.out.println("enter the operation: ");
		char operator = sc.next().charAt(0);
		if (operator=='*')
		System.out.println(num1*num2);
		else if (operator=='/')
		System.out.println(num1/num2);
		else if (operator=='-')
		System.out.println(num1-num2);
		else if (operator=='+')
		System.out.println(num1+num2);
	}

}
