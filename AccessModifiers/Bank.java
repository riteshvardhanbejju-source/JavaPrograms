package AccessModifiers;

public class Bank {
	private int accno;
	private String name;
	private String Lastname;
	private double balance;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}
	public void setName(String name) {
		this.name = name ;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance + this.balance;
	}
	
	
}
