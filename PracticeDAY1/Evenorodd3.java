package PracticeDAY1;
import java.util.Scanner;
public class Evenorodd3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = sc.nextInt();
		String value = (num%2==0)?"even":"odd";
		System.out.println(value);
		
	}

}
