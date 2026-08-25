package ProblemsALL;
import java.util.Scanner;

class areaa {
	public double Circle(double radius) {
		double area = 3.14*radius*radius;
		return area;
	}
}

public class AreaofCircle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		areaa ar = new areaa();
		System.out.println("enter the radius of circle");
		double area=ar.Circle(sc.nextDouble());
		System.out.println("area of circle is " + area);
	}

}
