package core.OPPS.Inheritance;
class product{
	String ProductName;
	double Price;
	public void ProductDetails(String ProductName,double Price) {
		this.ProductName=ProductName;
		this.Price=Price;
	}
}
class Electronics extends product{
	String Warranty;
	public void WarrantyDetails(String Warranty) {
		this.Warranty=Warranty;
	}
}
class Smartphone extends Electronics{
	String camara;
	String ram;
	int discount = 5000;
	double finalamount;
	public void phonedetails(String camara,String ram,int discount) {
		this.camara=camara;
		this.ram=ram;
	}
	public void discount() {
		finalamount = Price-discount;
	}
	public void show() {
		System.out.println("Product Name : "+ProductName);
		System.out.println("Price : "+Price);
		System.out.println("Warranty : "+Warranty);
		System.out.println("Camara : "+camara);
		System.out.println("RAM : "+ram);
		System.out.println("Discount : "+discount);
		System.out.println("Final Price : "+finalamount);
	}
}
public class ProductExample {

	public static void main(String[] args) {
		Smartphone sp = new Smartphone();
		sp.ProductDetails("iphone", 80688);
		sp.WarrantyDetails("4 years");
		sp.phonedetails("45 mp", "18 gb",5000);
		sp.discount();
		sp.show();
	}

}
