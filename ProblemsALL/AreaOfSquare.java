package ProblemsALL;
import java.util.Scanner;

class Square{
	public double Area(double side) {
		double area = side*side;
		return area;
	}
}



public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square Sq = new Square();
		System.out.println("enter the side of the square");
		double area = Sq.Area(sc.nextDouble());
		System.out.println(area);
	}

}
