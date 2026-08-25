package AccessModifiers;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mb = new Mobile();
		mb.setBrand("");
		mb.setModel("");
		mb.setPrice(242342);
		
		System.out.println(mb.getBrand()+" "+mb.getModel()+" "+mb.getPrice());
	}

}
