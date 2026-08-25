package PracticeDay2;
import java.util.Scanner;
public class MultipleOF3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if ((num%3==0 && num%5==0))
		System.out.println(num+" number is multiple of both 5 and 3 ");
		else
		System.out.println("not a multiple");
	}

}
