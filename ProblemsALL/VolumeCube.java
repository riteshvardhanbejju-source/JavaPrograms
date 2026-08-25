package ProblemsALL;
import java.util.Scanner;

class cube{
	public void volume(int side) {
		int volume = side*side*side;
		System.out.println(volume);
	}
}

public class VolumeCube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cube cb = new cube();
		System.out.println("enter the side of the cube");
		int side = sc.nextInt();
		cb.volume(side);
	}

}
