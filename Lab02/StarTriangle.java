import java.util.Scanner;
public class StarTriangle {
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Nhập chiều cao tam giác: ");
		int n = Keyboard.nextInt();
		
		for (int i = 0; i<n ; i++) {
			for (int j = 0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
