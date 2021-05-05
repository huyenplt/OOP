import java.util.Scanner;
public class AddTwoMatrices {
	public static void main(String[] args) {
		int a, b, n, m;
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Enter numbers of rows of matrix: ");
		m = Keyboard.nextInt();
		System.out.println("Enter numbers of colunms of matrix: ");
		n = Keyboard.nextInt();
		
		int mat1[][] = new int[m][n];
		int mat2[][] = new int[m][n];
		int sum[][] = new int[m][n];
		
		System.out.println("Enter all element of matrix 1: ");
		for (a = 0; a < m; a++){
			for (b = 0; b < n; b++) {
				mat1[a][b] = Keyboard.nextInt();
			}
		}
		
		System.out.println("Enter all element of matrix 2: ");
		for (a = 0; a < m; a++){
			for (b = 0; b < n; b++) {
				mat2[a][b] = Keyboard.nextInt();
			}
		}
		
		System.out.println("Matrix 1: ");
		for (a = 0; a < m; a++){
			for (b = 0; b < n; b++) {
				System.out.print(mat1[a][b] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix 2: ");
		for (a = 0; a < m; a++){
			for (b = 0; b < n; b++) {
				System.out.print(mat2[a][b] + " ");
			}
			System.out.println();
		}
		
		for (a = 0; a < m; a++){
			for (b = 0; b < n; b++) {
				sum[a][b] = mat1[a][b] + mat2[a][b];
			}
		}
		
		System.out.println("Sum of two matrices: ");
		for (a = 0; a < m; a++){
			for (b = 0; b < n; b++) {
				System.out.print(sum[a][b] + " ");
			}
			System.out.println();
		}
	}
}
