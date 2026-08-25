package ProblemsALL.LOOPS;

import java.util.Scanner;

class multiple{
	int num;
	public multiple(int num){
		for (int i=1;i<=10;i++) {
			int mul = i*num;
			System.out.println(num+"x"+i+"="+mul);
		}
	}
}
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		multiple ml = new multiple(n);
	}

}
