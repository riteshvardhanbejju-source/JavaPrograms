package core.OPPS;
class Calculations{
	public void areaofrectangle(double l,double b) {
		double area = l*b;
		System.out.println(area);
	}
	public int factorial(int num) {
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class MethodExamples {

	public static void main(String[] args) {
		Calculations cs=new Calculations();
		cs.areaofrectangle(5,5);
		cs.factorial(5);
	}

}
