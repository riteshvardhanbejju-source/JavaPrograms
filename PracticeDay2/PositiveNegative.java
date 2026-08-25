package PracticeDay2;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int a= sc.nextInt();
		if (a>0)
		System.out.println(a+ " is positive");
		else if (a<0)
		System.out.println(a+ " is negative");
		else
		System.out.println("the entered number is zero");
		
			
	}

}
