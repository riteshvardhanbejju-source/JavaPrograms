package ProblemsALL;
import java.util.Scanner;

class Area{
	public double AreaTri(double B, double H) {
		double area = 0.5*B*H;
		return area;
	}
}



public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Area ar = new Area();
		System.out.println("enter the height");
		double height = sc.nextDouble();
		System.out.println("enter the base");
		double base = sc.nextDouble();
		double area = ar.AreaTri(base, height);
		System.out.println(area);
		
	}

}
