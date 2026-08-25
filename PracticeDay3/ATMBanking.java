package PracticeDay3;
import java.util.Scanner;
public class ATMBanking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("     MENU \n 1.Check Balance \n 2.Deposit \n 3.Withdraw \n 4.Mini Statement \n 5.Exit");
		 double initial_balance = 10000;
		// int menu = sc.nextInt();
		int menu;
		do {	
			System.out.println("     MENU \n 1.Check Balance \n 2.Withdraw \n 3.Deposit \n 4.Mini Statement \n 5.Exit");
			menu = sc.nextInt();
			switch(menu){
			case 1 :
				System.out.println("your available balance is "+initial_balance);
				break;
			case 2 :
				System.out.println("enter the amount to be withdraw");
				int withdraw = sc.nextInt();
				if(withdraw<initial_balance) {
					initial_balance = (initial_balance-withdraw);
					System.out.println("balance"+initial_balance);
					System.out.println("withdrawl of amount "+withdraw+ "is successfull");
				}
				else {
					System.out.println("process failed");
					System.out.println("please check the balance and enter the amount accordingly");
				}
				break;
			case 3 :
				System.out.println("enter the amount you want to deposit");
				int deposit = sc.nextInt();
				initial_balance = (initial_balance+deposit);
				System.out.println("deposit of amount "+deposit+ "is successfull");
				break;
			case 4 :
				System.out.println();


			}
		}while(menu!=5);

	}
}