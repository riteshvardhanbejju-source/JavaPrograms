package ProblemsALL;
import java.util.Scanner;

class numbers{
	public void product(int a,int b) {
		int prod = a*b;
		System.out.println(prod);
	}
}




public class Product {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		numbers nb = new numbers();
		System.out.println("enter first number");
		int num1 = sc.nextInt();
		System.out.println("enter second number");
		int num2 = sc.nextInt();
		nb.product(num1, num2);
	}

}
