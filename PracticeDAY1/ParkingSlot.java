package PracticeDAY1;
import java.util.Scanner;
public class ParkingSlot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of vehicles entered ");
		int vehicles = sc.nextInt();
		int slots = 50;
		if ( slots<=vehicles) {
			for (int i=1;i<=vehicles;i++) {
				--slots;
			}
			System.out.println("available slots"+slots);
		}
		else {
			System.out.println("slots unavailable");
		}
		
	}

}
