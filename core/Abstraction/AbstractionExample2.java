package core.Abstraction;
abstract class ATM{
	int balance=15000;
	abstract void deposit(int amount);
	abstract void withdraw(int amount);
	abstract void check();
	public void show() {
		System.out.println("available balance :"+balance);
	}
}
class Transaction extends ATM{
	@Override
	void deposit(int amount) {
		balance+=amount;
		System.out.println("amount deposited :"+amount);
	}
	@Override
	void withdraw(int amount) {
		balance-=amount;
		System.out.println("amount withdrawn : "+amount);
	}
	@Override
	void check() {
		System.out.println("balance after transactions : "+balance);
	}
}
public class AbstractionExample2 {

	public static void main(String[] args) {
		Transaction tc = new Transaction();
		tc.show();
		tc.deposit(1000);
		tc.withdraw(6000);
		tc.check();
	}

}
