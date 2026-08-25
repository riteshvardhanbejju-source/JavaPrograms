package ProblemsALL;
import java.util.Scanner;

class body{
	public double mass(double weight,double height) {
		double bmi = weight/(height*height);
		return bmi;
	}
}


public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		body by = new body();
		System.out.println("enter the height in meters");
		double height = sc.nextDouble();
		System.out.println("enter the weight in meters");
		double weight = sc.nextDouble();
		
		double bmmi = by.mass(weight, height);
		System.out.println(bmmi);
	}

}
