package Exam;

import java.util.Scanner;

public class DetailsOFEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the employee name");
		String name = sc.nextLine();
		System.out.println("enter employee id");
		int id = sc.nextInt();
		System.out.println("enter the salary");
		float salary = sc.nextFloat();
		System.out.println("enter the active status");
		boolean status = sc.nextBoolean();
		
		System.out.println(name+" "+id+" "+salary+" "+status);
	}

}
