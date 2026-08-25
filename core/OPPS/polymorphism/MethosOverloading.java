package core.OPPS.polymorphism;

class Calculation{
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("sum of two int numbers = " +c);
	}
	public void add(double a,double b) {
		double c = a+b;
		System.out.println("sum of two double numbers = " +c);
	}
	public void add(int a,int b,int c) {
		int sum = a+b+c;
		System.out.println("sum of two int numbers = " +c);
	}
}



public class MethosOverloading {

	public static void main(String[] args) {
		Calculation cs = new Calculation();
		
		cs.add(3.45, 4.78);
		cs.add(45, 67);
		cs.add(4, 5, 6);
	}

}
