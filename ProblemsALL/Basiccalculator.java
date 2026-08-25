package ProblemsALL;
import java.util.Scanner;

class basic{
	public double multiply(double num1, double num2) {
		double mul = num1*num2;
		return mul;
	}
	public double sum(double num1,double num2) {
		double summ = num1+num2;
		return summ;
	}
	public double divide(double num1,double num2) {
		double div = num1/num2;
		return div;
	}
	public double modulus(double num1,double num2) {
		double rem = num1%num2;
		return rem;
	}
	public double substract(double num1,double num2) {
		double sub = num1 - num2;
		return sub;
	}
}
public class Basiccalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		basic bc = new basic();
		System.out.println("enter first number");
		double num1 = sc.nextDouble();
		System.out.println("enter second number");
		double num2 = sc.nextDouble();
		System.out.println(" 1.Multiplication \n 2.Addition \n 3.Division \n 4.Modulus \n 5.SubStraction");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			double ans = bc.multiply(num1, num2);
			System.out.println("multiplication of "+num1+" and "+num2+" is "+ans);
			break;
		case 2:
			double anss = bc.sum(num1, num2);
			System.out.println("addition of "+num1+" and "+num2+" is "+anss);
			break;
		case 3:
			double ansss = bc.divide(num1, num2);
			System.out.println("division of "+num1+" and "+num2+" is "+ansss);
			break;
		case 4:
			double anssss = bc.modulus(num1, num2);
			System.out.println("modulus of "+num1+" and "+num2+" is "+anssss);
			break;
		case 5:
			double anns = bc.substract(num1, num2);
			System.out.println("substraction of "+num1+" and "+num2+" is "+ anns);
			break;
		}
		
	}

}
