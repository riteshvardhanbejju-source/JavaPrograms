package ProblemsALL;
import java.util.Scanner;

class tri{
	public double areaaa(double base ,double height) {
		double area = 0.5*base*height;
		return area;
	}
}
class perimeterr{
	public double perim(double s1,double s2,double s3) {
		double perimeter = s1+s2+s3;
		return perimeter;
	}
}
public class AreaPerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		tri tr = new tri();
		perimeterr pr = new perimeterr();
		
		System.out.println("1.area of triangle, 2.perimeter of triangle");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("enter the base ");
			double base = sc.nextDouble();
			System.out.println("enter the perimeter");
			double height = sc.nextDouble();
			double are = tr.areaaa(base, height);
			System.out.println(are);
			break;
		case 2:
			System.out.println("enter the side1 ");
			double s1 = sc.nextDouble();
			System.out.println("enter the side2 ");
			double s2 = sc.nextDouble();
			System.out.println("enter the side3 ");
			double s3 = sc.nextDouble();
			double perimee=pr.perim(s1, s2, s3);
			System.out.println(perimee);
		
		default:
			System.out.println("choose correct option");
		}
	}

}
