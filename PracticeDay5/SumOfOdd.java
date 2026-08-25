package PracticeDay5;
import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int sum = 0;
		int num = sc.nextInt();
		for (int i=1;i<=num;i++) {
			if (i%2!=0) {
				sum=sum+i;
			}
		}System.out.println(sum);
	}

}
