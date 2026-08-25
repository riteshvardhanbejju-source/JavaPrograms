package Exam;

import java.util.Scanner;

public class AreaPreimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = 24;
		double height = 35;
		double area;
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			 area = 0.5*base*height;
			 System.out.println("area of triangle "+area);
			 break;
		case 2:
			System.out.println("enter 1st side");
			int side1=sc.nextInt();
			System.out.println("enter 2nd side");
			int side2=sc.nextInt();
			System.out.println("enter 3rd side");
			int side3=sc.nextInt();
			int perimeter = side1*side2*side3;
			System.out.println(perimeter);
		}
	}

}
