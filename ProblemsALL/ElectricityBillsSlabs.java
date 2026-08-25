package ProblemsALL;
import java.util.Scanner;

class bill{
	public void current(double units){
		if(units<=100 && units>0) {
			double total = units*5;
			System.out.println("total bill is "+total);
		}
		else if (units<=200 && units>100){
			double total = (units-100)*7+(100*5);
			System.out.println(total);
		}
		else if(units>200){
			double total = (100*5)+(100*7)+((units-200)*10);
			System.out.println(total);
		}
	}
}


public class ElectricityBillsSlabs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bill bl = new bill();
		System.out.println("enter the units");
		double unit = sc.nextDouble();
		bl.current(unit);
	}

}
