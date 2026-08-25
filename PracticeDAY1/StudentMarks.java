package PracticeDAY1;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name- ");
		String NAME = sc.nextLine();
		System.out.println("enter marks of the students");
		int English = sc.nextInt();
		int hindi = sc.nextInt();
		int telugu = sc.nextInt();
		int maths = sc.nextInt();
		int science = sc.nextInt();
		
		int total = English+hindi+telugu+maths+science;
		int average = total/5;
		
		System.out.println("total marks of students : "+ total);
		System.out.println("average marks of students : "+ average);
		System.out.println("percentage : "+ average+"%");
		
		
	}

}
