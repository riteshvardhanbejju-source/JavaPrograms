package Exam;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int oddcount = 0;
		int evencount = 0;
		while (num>0) {
			int digit = num%10;
			if(digit%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
			num=num/10;
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
