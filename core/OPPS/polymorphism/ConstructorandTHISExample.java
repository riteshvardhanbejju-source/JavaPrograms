package core.OPPS.polymorphism;
class mobile{
	String brand;
	String model;
	double cost;
	String storage;
	String ram;
	int qty;
	public mobile(){
		this("Samsung");
	}
	public mobile(String brand){
		this(brand,"S22",75000);
		this.brand=brand;
	}
	public mobile(String brand,String model,double cost){
		this(brand,model,"18GB");
		this.brand=brand;
		this.cost=cost;
		this.model=model;
	}
	public mobile(String brand,String model,String ram){
		this(brand,model,ram,"512GB",3);
		this.brand=brand;
		this.ram=ram;
		this.model=model;
	}
	public mobile(String brand,String model,String ram,String storage,int qty){
		this.brand=brand;
		this.ram=ram;
		this.model=model;
		this.storage=storage;
		this.qty=qty;
	}
	public void show() {
		double totalcost = cost*qty;
		System.out.println("total cost for the model below is "+totalcost);
		System.out.println(brand+" "+model+" "+ram+" "+storage+"\n quantity selected "+qty);
		
	}
}
public class ConstructorandTHISExample {

	public static void main(String[] args) {
		mobile mb= new mobile();
		mb.show();
	}

}
