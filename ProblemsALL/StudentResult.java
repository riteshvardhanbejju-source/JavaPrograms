package ProblemsALL;
import java.util.Scanner;

class Resultt{
	public void marks(int total) {
		if (total>=85 && total<100) {
			System.out.println("Distinction");
		}
		else if(total>=65 && total<85) {
			System.out.println("First class");
		}
		else if(total>=45 && total<65) {
			System.out.println("Second class");
		}
		else if (total>=25 && total<45) {
			System.out.println("Pass");
		}
		else if (total>=0 && total<25) {
			System.out.println("Fail");
		}
		else {
			System.out.println("enter correct marks 1-100");
		}
		
	}
}



public class StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Resultt rt = new Resultt();
		System.out.println("enter the total marks");
		rt.marks(sc.nextInt());
	}

}
