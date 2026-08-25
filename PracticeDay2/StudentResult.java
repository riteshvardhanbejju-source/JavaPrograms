package PracticeDay2;
import java.util.Scanner;
public class StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int marks = sc.nextInt();
		if (marks<=100 && marks>=0) {
			if (marks>=90 && marks<=100)
				System.out.println("Distinction");
				else if (marks>=75 && marks<90)
				System.out.println("First Class");
				else if (marks>=60 && marks<75)
				System.out.println("Second Class");
				else if (marks>=50 && marks<60)
				System.out.println("Pass");
				else
				System.out.println("Fail");	
		}
		else
		System.out.println("invalid input");
	}

}
