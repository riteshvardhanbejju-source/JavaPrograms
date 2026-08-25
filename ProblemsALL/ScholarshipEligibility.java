package ProblemsALL;
import java.util.Scanner;

class fee{
	public void scholar(double salary, double marks) {
		if(marks>=80 && salary<=80000)
		System.out.println("eligible for sholarship sc" );
		else {
			System.out.println("not eligible fro scholarship");
		}
}
public class ScholarshipEligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fee fd = new fee();
		System.out.println("enter the marks");
		double marks = sc.nextDouble();
		System.out.println("enter the salary");
		double salary = sc.nextDouble();
		fd.scholar(salary, marks);
		
		}
	}
}
