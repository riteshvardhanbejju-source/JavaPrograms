package PracticeDay5;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		String vr ="";
		while (num>0) {
			 int digit = num%10;
			 vr=vr+digit;
			 num=num/10;
		}
		int hot = Integer.valueOf(vr);
		System.out.println(vr);
	}

}
