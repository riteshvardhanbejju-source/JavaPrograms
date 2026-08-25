package core.OPPS.Inheritance;
class Shape{
	String color;
	public void setColor(String color) {
		this.color=color;
		System.out.println("Color = "+color);
	}
	public void area() {
		System.out.println("parent class area method");
	}
}
class circle extends Shape{
	@Override
	public void area() {
		double rad =5.45;
		double area = 3.14*rad*rad;
		System.out.println("Area of circle : "+area);
	}
}
class Rectangle extends Shape{
	@Override
	public void area() {
		double len = 2.4,bre = 3.7;
		double area = len*bre;
		System.out.println("area of rectangle: "+area);
	}
}
public class heirarichal_inheritance {

	public static void main(String[] args) {
		circle cr = new circle();
		cr.setColor("red");
		cr.area();
		
		Rectangle rc = new Rectangle();
		rc.setColor("white");
		rc.area();
	}

}
