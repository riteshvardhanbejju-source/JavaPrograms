package core.OPPS.Inheritance;
//if parent class have constructor child class must have constructor
class Vehicle{
	public Vehicle(String brand) {
		System.out.println("brand name is "+brand);
	}
}
class carr extends Vehicle{
	public carr(String brand,double cost) {
		super(brand);
		System.out.println("cost of thr car "+cost);
	}
}
public class SuperExample {

	public static void main(String[] args) {
		carr cr = new carr("BMW",2300000);
		
	}

}
