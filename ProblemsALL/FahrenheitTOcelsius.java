package ProblemsALL;
import java.util.Scanner;



public class FahrenheitTOcelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Converter cv = new Converter();
		
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius ");
		int choose = sc.nextInt();
		
		switch (choose) {
		
		case 1:
			System.out.println("enter the temparature");
			cv.celsius = sc.nextDouble();
			
			System.out.println(cv.CeltoFah());
			break;
			
		case 2:
			System.out.println("enter the temparature");
			cv.fahrenheit = sc.nextDouble();
			
			System.out.println(cv.fahtocel());
		}

	}

}
