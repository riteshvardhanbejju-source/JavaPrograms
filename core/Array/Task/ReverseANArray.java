package core.Array.Task;

public class ReverseANArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println("Actual array");
		for(int nb:arr) {
			System.out.print(nb+" ");
		}
		System.out.println("\nAfter reversing");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
