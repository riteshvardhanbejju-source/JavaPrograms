package PracticeDAY1;
import java.util.Scanner;
public class Currency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount in rupees");
		float rupees = sc.nextFloat();
		float dollar = rupees/85;
		System.out.println((rupees)+"rupees is equal to  "+(dollar));

	}

}
