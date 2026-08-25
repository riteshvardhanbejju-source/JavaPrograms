package PracticeDay2;
import java.util.Scanner;
public class Scholarship {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();
		System.out.println("enter attendance");
		int attendance = sc.nextInt();
		String result = (marks>80) && (attendance>60)?"eligible":"noteligible";
		System.out.println(result);
	}

}
