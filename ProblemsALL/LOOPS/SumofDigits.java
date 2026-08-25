package ProblemsALL.LOOPS;
import java.util.Scanner;

class add{
	public add(int num) {
		int sum = 0;
		while(num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
	}
}
public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		add ad = new add(1234);
	}

}
