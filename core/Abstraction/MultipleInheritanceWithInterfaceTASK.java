package core.Abstraction;

import java.util.Scanner;

class Customer{
//	int Units =350;
	public void displayUnits(int Units) {
		System.out.println("Units Consumed = "+Units);
	}
}
interface Bill{
	public void calculateBill(int Units);
}
class ElectricityBill extends Customer implements Bill{
	int fixedCharges=100;
	int tot;
	@Override
	public void calculateBill(int Units) {
		if(Units>300) {
			 tot = (Units*8);
		}else {
			 tot = (Units*6);
		}
	}
	public void Display() {
		int totall=tot+fixedCharges;
		System.out.println("Energy charge = "+tot);
		System.out.println("fixed charges = "+fixedCharges);
		System.out.println("Total charges= "+totall);
	}
}
public class MultipleInheritanceWithInterfaceTASK {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the units");
		int unit=sc.nextInt();
		ElectricityBill ec = new ElectricityBill();
		ec.displayUnits(unit);
		ec.calculateBill(unit);
		ec.Display();
	}

}
