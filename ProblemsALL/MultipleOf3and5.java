package ProblemsALL;
import java.util.Scanner;

class both{
	int number;
	public void need() {
		if(number%3==0 && number%5==0) {
			System.out.println(number+ " is divisible by both 3 and 5");
		}else
		System.out.println(number+ " is not divisible by both 3 and 5");

		
	}
}

public class MultipleOf3and5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		both bc = new both();
		System.out.println("enter the number");
		bc.number = sc.nextInt();
		bc.need();
		
	}

}
