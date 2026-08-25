package ProblemsALL.LOOPS;

import java.util.Scanner;

class count{
	public count(int num){
		int count = 0;
		while(num>0) {
			int digit = num%10;
			count = count+1;
			num=num/10;
		}
		System.out.println(count);
	}
}
public class CountTheDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		count cc = new count(1234);
	}

}
