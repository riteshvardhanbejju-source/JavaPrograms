package ProblemsALL;

import java.util.Scanner;

class multiples{
	public void mul(int num) {
		if (num%5==0) {
			System.out.println(num +" is multiple of 5");
		}
		else
		System.out.println("not a multiple of 5");
	}
}
public class MultipleOf5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		multiples ml = new multiples();
		System.out.println("enter the number");
		int num = sc.nextInt();
		ml.mul(num);
	}

}
