package PracticeDAY1;
import java.util.*;
public class Calculater {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("enter the first number: ");
		int num2 = sc.nextInt();
		System.out.println("enter the operation: ");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
		case'*':
			System.out.println((num1)+" * "+(num2)+" = "+(num1*num2));
			break;
		case'+':
			System.out.println((num1)+" + "+(num2)+" = " +(num1+num2));
			break;
		case'/':
			System.out.println((num1)+" / "+(num2)+" = " +(num1/num2));
			break;
		case'%':
			System.out.println((num1)+" % "+(num2)+" = " +(num1%num2));
			break;
		
			
		}
		
	}

}
