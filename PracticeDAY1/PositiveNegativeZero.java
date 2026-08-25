package PracticeDAY1;
import java.util.Scanner;
public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = sc.nextInt();
		String num1 = (num>0)?"positive":num<0?"neagtive":"zero";
		System.out.println(num1);
	}

}
