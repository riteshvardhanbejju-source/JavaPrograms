package ProblemsALL;
import java.util.Scanner;

class Large{
	public void Larges(int num1 , int num2) {
		
		
		if (num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
}



public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Large lg = new Large();
		System.out.println("enter first number");
		int num3 = sc.nextInt();
		System.out.println("enter second number");
		int num5 = sc.nextInt();
		lg.Larges(num3, num5);
	}

}
