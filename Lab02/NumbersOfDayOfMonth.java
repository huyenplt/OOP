import java.util.Scanner;
public class NumbersOfDayOfMonth {
	public static void main (String[] args) {
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Nhập năm: ");
		int year = Keyboard.nextInt();
		
		System.out.print("Nhập tháng: ");
		String month = Keyboard.next();
		
		int dayNum = 0;
		
		switch(month) {
			case "January":
			case "Jan":
			case "Jan.":
			case "1":
			case "March":
			case "Mar.":
			case "Mar":
			case "3":
			case "May":
			case "5":
			case "July":
			case "Jul":
			case "7":
			case "August":
			case "Aug":
			case "Aug.":
			case "8":
			case "October":
			case "Oct":
			case "Oct.":
			case "10":
			case "December":
			case "Dec":
			case "Dec.":
			case "12":
				dayNum = 31;
				break;
			case "February":
			case "Feb.":
			case "Feb":
			case "2":
				if(year % 4 == 0) {
					dayNum = 29;
				}
				else dayNum = 28;
				break;
			case "April":
			case "Apr.":
			case "Apr":
			case "4":
			case "June":
			case "Jun":
			case "6":
			case "September":
			case "Sept":
			case "Sep.":
			case "9":
			case "November":
			case "Nov":
			case "Nov.":
			case "11":
				dayNum = 30;
				break;
			default:
				System.out.println("Không hợp lệ. Vui lòng nhập ");
			}
		System.out.print("Tháng "+ month + " năm " + year + " có " + dayNum + " ngày.");
		
	}
}
