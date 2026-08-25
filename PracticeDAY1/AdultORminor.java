package PracticeDAY1;
import java.util.Scanner;
public class AdultORminor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		String result = (age>=18)?"Adult":"Minor";
		System.out.println(result);
	}

}
