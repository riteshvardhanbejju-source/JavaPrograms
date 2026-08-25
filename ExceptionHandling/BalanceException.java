package ExceptionHandling;
class InsuficientBalanceException extends Exception
{
	public InsuficientBalanceException(String msg) {
		super(msg);
	}
}
public class BalanceException {
	static int balance=10000;
	public static void withdraw(int amt)throws InsuficientBalanceException
	{
		if(balance<amt)
			throw new InsuficientBalanceException("Balance is not sufficient0");
		else {
			balance = balance-amt;
			System.out.println("withdraw success");
			System.out.println("available " +balance);
		}
	}
	public static void main(String[] args) {
		try {
			withdraw(35000);
		}
		catch (InsuficientBalanceException iss) {
			System.out.println(iss);
		}
	}

}
