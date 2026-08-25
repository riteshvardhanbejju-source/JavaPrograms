package core.OPPS.polymorphism;
class product{
	int prid;
	String prname;
	double prcost;
	int prqty;
	public product() {
		System.out.println("product default constructor");
	}
	public product(int prid,String prname) {
		this.prid=prid;
		this.prname=prname;
	}
	public product(int prid,String prname,double prcost,int prqty) {
		this.prcost=prcost;
		this.prid=prid;
		this.prname=prname;
		this.prqty=prqty;
	}
	public void show() {
		double totalcost = prqty*prcost;
		System.out.println(prid+" "+prname);
		System.out.println(prqty+" "+prcost);
		System.out.println("total cost= "+totalcost);
	}
}
public class ConstructorNewExample {

	public static void main(String[] args) {
		product pd= new product();//default constructor
		product pd1= new product(12,"iphone");
		pd1.show();
		product pd2= new product(23,"laptop",78000,9);
		pd2.show();
	}

}
