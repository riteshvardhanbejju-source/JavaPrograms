package Problems;
import java.util.Scanner;
public class SecretNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int snum = 9567;
		int guess;
		do {
			System.out.println("enter the secret number");
			guess = sc.nextInt();
			if(guess>snum) {
				System.out.println("too high");
			}
			else if (guess<snum) {
				System.out.println("too low");
			}
			else if (guess==snum) {
				System.out.println("correct guess");
				break;
			}
			
		}while (guess!=snum);
	}

}
