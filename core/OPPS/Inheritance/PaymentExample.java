package core.OPPS.Inheritance;
class Payment{
	int amount = 700;
	void pay() {
		System.out.println("Default payment method");
	}
}
class CreditCard extends Payment{
	@Override
	void pay() {
		super.pay();
		System.out.println("Amount paid through credit card - "+amount);
	}
}
class UPI extends CreditCard{
	@Override
	void pay() {
		super.pay();
		System.out.println("Amount paid through  UPI - "+amount);
		}
}
class debitcard extends UPI{
	@Override
	void pay() {
		super.pay();
		System.out.println("Amount paid through debitcard - "+amount);
	}
}
public class PaymentExample {

	public static void main(String[] args) {
//		CreditCard cc = new CreditCard();
//		cc.pay();
//		UPI up = new UPI();
//		up.pay();
		debitcard db = new debitcard();// using super keyword in every class we can do like a chain structure and by calling only last child class we can call all the classes content
		db.pay();
	}

}
