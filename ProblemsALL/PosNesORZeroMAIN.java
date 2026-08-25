package ProblemsALL;

import java.util.Scanner;

public class PosNesORZeroMAIN {

	public static void main(String[] args) {
		PosNeg pn = new PosNeg(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		pn.number(num);
	}

}
