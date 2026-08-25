package TimePass;

import java.util.Scanner;

class kaprikar{
	public void Number(int num) {
		int square = num*num;
		int temp = square;
		
		int digits = 0;
		//counting the digits to find a divisor
		while(square>0) {
			digits = digits+1;
			square = square/10;
		}
		
		int divisor = 1;
		for(int i=1;i<=digits/2;i++) {
			divisor = divisor*10;
		}
		
		int right = temp % divisor;
		int left = temp / divisor;
		
		int add = right+left;
		
		if(add==num) {
			System.out.println("kaprikar number");
		}else {
			System.out.println("not a kaprikar number");
		}
		
		
	}
}
public class KaprikarNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		kaprikar kp = new kaprikar();
		System.out.println("enter a number");
		kp.Number(sc.nextInt());

	}

}
