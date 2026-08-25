package PracticeDAY1;
import java.util.Scanner;
public class PassORFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total marks");
		int marks = sc.nextInt();
		String result = (marks>=35)?"pass":"fail";
		System.out.println(result);
	}

}
