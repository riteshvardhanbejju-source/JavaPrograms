package core.OPPS.polymorphism;

class calculate
{
	public double area(double radius) {
		double area=3.15*(radius*radius);
		return area;
	}
	public double area(double base , double height) {
		double area=0.5*(base*height);
		return area;
	}
	public double area(int side) {
		double area=(side*side);
		return area;
	}
}


public class MethodOverloding2 {

	public static void main(String[] args) {
		calculate ct = new calculate();
		System.out.println("area of circle is = "+ct.area(3.56));
		System.out.println("area of triangle is = "+ct.area(60));
		System.out.println("area of square is = "+ct.area(32, 45));
	}

}
