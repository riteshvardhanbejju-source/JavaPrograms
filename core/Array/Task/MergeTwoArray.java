package core.Array.Task;

public class MergeTwoArray {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		System.out.println("------Array 1 Elements");
		
		for(int nb:arr) {
			System.out.print(nb+" ");
		}System.out.println();
		
		int[] brr = {6,7,8,9,10};
		System.out.println("\n------Array 2 Elements");
		
		for(int nn:brr) {
			System.out.print(nn+" ");
		}System.out.println();
		
		int[] merge = new int[arr.length+brr.length]; 
		
		//for merging 1st loop 
		for(int i=0;i<arr.length;i++) {
			merge[i]=arr[i];
		}
		//for merging 2nd loop 
		for(int i=0;i<brr.length;i++) {
			merge[arr.length+i]=brr[i];
		}System.out.println();
		System.out.println("-------Merged Array------");
		for(int nv:merge) {
			System.out.print(nv+" ");
		}
	}

}
