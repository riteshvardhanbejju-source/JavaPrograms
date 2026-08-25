package PracticeDay5;
import java.util.Scanner;
public class CountEvenORODD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int evcount = 0;
		int odcount = 0;
		while (num>0) {
			int digit = num%10;
			
			if (digit%2==0) {
				evcount=evcount+1;
			}else {
				odcount=odcount+1;
			}
			num=num/10;
			
		}
		System.out.println("even count = "+evcount);
		System.out.println("odd count = "+odcount);
	}

}
