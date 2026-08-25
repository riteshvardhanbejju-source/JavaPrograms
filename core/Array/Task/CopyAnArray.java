package core.Array.Task;

public class CopyAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		System.out.println("-----Elements in array 1-----");
		for(int bb:arr) {
			System.out.print(bb+" ");
		}
		
		
		int[] brr = new int[arr.length];
		
		System.out.println("\n-----Elements in array 2------");
		for(int i=0;i<arr.length;i++) {
			brr[i]=arr[i];
		}
		for(int nb:brr) {
			System.out.print(nb+" ");
		}
		
		
	}

}
