package TimePass;

import java.util.Scanner;

class odd{
	int num;
	public void palindrome() {
		int digit=0;
		int temp=num;
		int temp1=num;
		int reverse = 0;
		//counting digits in number
		while(num>0) {
			digit++;
			num=num/10;
		}
		if(digit%2!=0) {
			while(temp>0) {
				int unqs=temp%10;
				reverse = reverse*10+unqs;
				temp = temp/10;
			}
		}else {
			System.out.println("the number have even digits");
		}
		if(reverse==temp1) {
			System.out.println("its a odd palindrome");
		}else {
			System.out.println("not a odd palindrome");
		}
		
	}
}
public class OddPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		odd od = new odd();
		System.out.println("enter a number");
		od.num=sc.nextInt();
		od.palindrome();

	}

}
