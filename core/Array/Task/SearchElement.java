package core.Array.Task;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number to find");
		int num=sc.nextInt();
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		boolean find = false;
		
		
		System.out.println("------Elements-----");
		for(int ar:arr) {
		System.out.print(ar+" ");
		}
		
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
			find=true;
			}
		}
		
		System.out.println("\n------element finding result------");
		if (find==true)
		System.out.println("element found");

		else 
			System.out.println("Element Not Found");
	}

}
