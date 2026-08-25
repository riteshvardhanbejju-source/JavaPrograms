package PracticeDAY1;
import java.util.Scanner;
public class BillCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter product price");
		float product = sc.nextFloat();
		System.out.println("enter product quantity");
		float quantity = sc.nextFloat();
		
		float total = product*quantity;
		float GST = total*0.18f;
		float Final = total+GST;
		System.out.println("total : "+(total));
		System.out.println("GST : "+(GST));
		System.out.println("FINAL AMOUNT : "+(Final));
		
	}

}
