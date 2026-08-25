package PracticeDAY1;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		String vote = (age>=18)?"eligible":"not eligible";
		System.out.println(vote);
	}

}
