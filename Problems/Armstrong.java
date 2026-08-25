package Problems;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 159;
		int arm = 0;
		int temp = num;
		while (num>0) {
			int digit= num%10;
			arm=arm+(digit*digit*digit);
			num=num/10;
		}
		if (arm==temp)
		System.out.println("armstrong");
		else
		System.out.println("not a armstrong");
	}

}
