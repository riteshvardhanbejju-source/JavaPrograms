package AccessModifiers;

public class BankMain {

	public static void main(String[] args) {
		Bank bk = new Bank();
		bk.setAccno(224525);
		bk.setName("ritesh");
		bk.setLastname("vardhan");
		bk.setBalance(787.908);
		bk.setBalance(787.908);
		bk.setBalance(787.908);
		
		System.out.println(bk.getAccno());
		System.out.println(bk.getName());
		System.out.println(bk.getBalance());
		System.out.println(bk.getName()+bk.getLastname());
	}

}
