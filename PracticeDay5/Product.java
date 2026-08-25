package PracticeDay5;
import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  number");
		int num=sc.nextInt();
		int prod = 1;
		while (num>0) {
		int digit = num%10;
		prod = digit*prod;
		num=num/10;
		} System.out.println(prod);
	}
}
