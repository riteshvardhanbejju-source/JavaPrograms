package Exam;

import java.util.Scanner;

public class FahtoCel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.fahrenheit to celcius , 2.celcius to fahrenheit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter the degrees");
			double temp = sc.nextDouble();
			double cel = 5/9*(temp-32);
			System.out.println("Celcius = " + cel);
		case 2:
			System.out.println("enter the degrees");
			double temp1 = sc.nextDouble();
			double fah = 9/5*(temp1-32);
			System.out.println("fahrenheit = " + fah);
		}
	}

}
