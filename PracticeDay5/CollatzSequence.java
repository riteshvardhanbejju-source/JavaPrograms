package PracticeDay5;
import java.util.Scanner;
public class CollatzSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		while (num!=1) {
			if (num%2==0) {
				num=num/2;
			}else {
				num=(num*3)+1;
			}System.out.println(num);
		}
				
	}

}
