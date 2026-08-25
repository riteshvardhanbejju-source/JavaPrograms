package ritesh;
import java.util.Scanner;
public class SwitchCAses {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character to check: ");
		char ch = s.next().toLowerCase().charAt(0);
		switch(ch) {
		case 'a' :
		case 'e':
		case 'i' :
		case 'o' :
		case 'u' : System.out.println("Vowel");
		   break;
		default: System.out.println("Consonant");
		}

	}

}
