package OwnWork;
import java.util.Scanner;

class sum{
	public void numm(int num) {
		int sum=0;
		while(num>0) {
			int digit = num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
	}
}
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sum sm = new sum();
//		System.out.println("enter a number");
//		int num = sc.nextInt();
//		sm.numm(num);
		System.out.println(8%2);
	}

}
