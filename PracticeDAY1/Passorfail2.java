package PracticeDAY1;
import java.util.Scanner;
public class Passorfail2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks of the student");
		int marks = sc.nextInt();
		String result = (marks>=25)?"Pass":"Fail";
		System.out.println(result);
	}

}
