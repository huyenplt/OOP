import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MyDate date1 = new MyDate("Feb 18th 2019");
		// System.out.println(date1.getDay());
		System.out.println("Date list:");
		System.out.println();
		System.out.print("Date1:	");
		MyDate date1 = new MyDate("February 18th 2000");
		date1.print();  
		System.out.println();
		
		MyDate date2 = new MyDate();
		System.out.print("Date2:	");
		date2.print();
		System.out.println();
		
		MyDate date3 = new MyDate("second","September","Two Thousand Nine");
		System.out.print("Date3:	");
		date3.print();
		System.out.println();
		
		MyDate date4 = new MyDate(2,4,2021);
		System.out.print("Date4:	");
		date4.print();
		System.out.println("\n-----------------");
		
		
		System.out.println("Compare date1 and date2:\n");
		DateUtils.printCompareResult(DateUtils.compareTwoDates(date1, date2), date1, date2);
		System.out.println();
		System.out.println("-----------------");
		
		MyDate[] arrDates = {date1, date2, date3, date4};
		DateUtils.sortDates(arrDates);
		
		System.out.println("-----------------");
		
		// to print cur date with a format chosen
//		System.out.println("Choose one option of date formats below:");
//		System.out.println("1.yyyy-MM-dd");
//		System.out.println("2.d/M/yyyy");
//		System.out.println("3.dd-MMM-yyyy");
//		System.out.println("4.MMM d yyyy");
//		System.out.println("5.mm-dd-yyyy");
//		Scanner keyboard = new Scanner(System.in);
//		int formatChoice = 0;
//		System.out.println("Enter number of the option you want");
//		formatChoice = keyboard.nextInt();
//		if (formatChoice < 6 && formatChoice > 0) {
//			MyDate.print(formatChoice);
//		} else {
//			System.out.println("Invalid option!");
//		}
//		keyboard.close();
	}

}
