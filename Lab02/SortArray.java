import java.util.Scanner;
public class SortArray {
	public static void main(String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int length = Keyboard.nextInt();
		int arr[] = new int[length];
		int sum = 0, temp = 0;
		double average = 0;
		System.out.print("Enter elements: ");
		for (int i = 0; i < length; i++) {
			arr[i] =  Keyboard.nextInt();
			sum = sum + arr[i];
		}
		average = (double)sum / length;
		
		System.out.println("Original array: ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++ ) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("\nSorted array: ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.print("\nSum = "+sum+" , Average = "+average);
	}
	
}
