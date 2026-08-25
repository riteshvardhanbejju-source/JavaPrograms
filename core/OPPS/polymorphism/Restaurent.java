package core.OPPS.polymorphism;
import java.util.Scanner;

class Foodorder{
	public void order(String item) {
		System.out.println("Item  : "+item);
		System.out.println();
	}
	public void order(String item, int quantity) {
		System.out.println("Item  : "+item +"\nQuantity : "+quantity  );
		System.out.println();
	}
	public void order(String item,int quantity , boolean homedelivery ) {
		System.out.println("Item  : "+item +"\nQuantity : "+quantity +"\nHomedelivery : "+homedelivery);
		System.out.println();
	}
	public void order(String item1,String item2,String item3,String item4) {
		System.out.println("Items ordered : "+item1+","+item2+","+item3+","+item4);
	}
}

public class Restaurent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Foodorder fd = new Foodorder();
		System.out.println("enter the single food item here");
		fd.order(sc.nextLine());
		System.out.println("Enter one food item and quantity you need");
		fd.order(sc.nextLine(), sc.nextInt());
		System.out.println("Enter one food item and quantity you need and DO YOU NEED HOME DELIVERY");
		fd.order(sc.next(),sc.nextInt(),sc.nextBoolean());
		System.out.println("enter four food items ");
		fd.order(sc.next(),sc.next(),sc.next(), sc.next());
	}

}
