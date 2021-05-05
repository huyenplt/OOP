import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public boolean setDay(int day) {
		if(day <= 0 || day > 31) return false;
		else {
			this.day = day;
			return true;
		}
	}
	public int getMonth() {
		return month;
	}
	public boolean setMonth(int month) {
		if(month < 0 || month > 12) return false;
		else {
			this.month = month;
			return true;
		}
	}
	public int getYear() {
		return year;
	}
	public boolean setYear(int year) {
		if (year < 0 || year > 2021) return false;
		else {
			this.year = year;
			return true;
		}
	}
	
	public MyDate() {
		LocalDate curDate = LocalDate.now();
		this.day = curDate.getDayOfMonth();
		this.month = curDate.getMonthValue();
		this.year = curDate.getYear();
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate(String strDate) {
		String[] datePart = strDate.split("-");
		this.day = Integer.parseInt(datePart[0]);
		this.month = Integer.parseInt(datePart[1]);
		this.year = Integer.parseInt(datePart[2]);
//		System.out.print(this.day+","+this.month+","+this.year);
	}
	public void accept() {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please enter a random date (e.g.: 12-03-2021): ");
		String strDate = Keyboard.nextLine();
		MyDate test = new MyDate(strDate);
		System.out.println("day: " + test.day+", month: " + test.month+", year: " + test.year);

		Keyboard.close();
	}
	public void print() {
		MyDate test = new MyDate();
		System.out.print("Today is "+ test.day + " / " + test.month+ " / " + test.year);
	}
	
}


