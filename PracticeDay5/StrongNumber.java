package PracticeDay5;
import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int var = num;
		int last = 0;
		while(num>0) {
			int digit=num%10;
			
			int mul = 1;

			for (int i=digit;i>0;i--) {
				mul=mul*i;
			}
			num=num/10;
			last = mul+last;
		}if (last==var)
		System.out.println("strong number");
		else
		System.out.println("not a strong number");
	}

}
