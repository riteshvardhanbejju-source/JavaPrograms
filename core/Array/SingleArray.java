package core.Array;

public class SingleArray {

	public static void main(String[] args) {
		int marks[]=new int[5];
		marks[0]=4;
		marks[1]=7;
		marks[2]=5;
		marks[3]=7;
		marks[4]=8;
		
		int sum=0,esum=0,osum=0;
		System.out.println("Array values");
		System.out.println("index 3rd value"+marks[3]);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
			sum=sum+marks[i];
		}
		System.out.println("Total = "+sum);
		for(int i=0;i<marks.length;i++) {
			if(marks[i]%2==0) {
				esum=esum+marks[i];
			}else {
				osum=osum+marks[i];
			}
		}System.out.println("even sum = "+esum);
		System.out.println("odd sum = "+osum);
	}
		
	}

