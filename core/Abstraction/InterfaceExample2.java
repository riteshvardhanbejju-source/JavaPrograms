package core.Abstraction;
interface Fooddelivery{
	public void trackorder();
	public void status();
	default public void foodReview() {
		System.out.println("review of food is good");
	}
	static void details() {
		System.out.println("amount paid by upi");
	}
}
class Order implements Fooddelivery{
	@Override
	public void trackorder() {
		System.out.println("tracked by google maps");
	}
	@Override
	public void status() {
		System.out.println("order delivered");
	}
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		Order or = new Order();
		or.trackorder();
		or.foodReview();
		or.status();
		Fooddelivery.details();
	}

}
