package ProblemsALL.LOOPS;

import java.util.Scanner;

class sum{
	 int num;
	public sum(int num){
		this.num=num;
		for (int i=1;i<=num;i++) {
			System.out.println(i);
		}
	}
}
public class Numbers1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		sum s = new sum(n);
	}

}
