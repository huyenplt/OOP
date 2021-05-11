
public class DateUtils {
	public static int compareTwoDates(MyDate date1, MyDate date2){
		if (date1.getYear() > date2.getYear()) {
			return 1;
		} else if (date1.getYear() < date2.getYear()) {
			return -1;
		} else {
			if (date1.getMonth() > date2.getMonth()) {
				return 1;
			} else if (date1.getMonth() < date2.getMonth()) {
				return -1;
			} else {
				if (date1.getDay() > date2.getDay()) {
					return 1;
				} else if (date1.getDay() < date2.getDay()) {
					return -1;
				} else {
					return 0;
				}
				
			}
		}
		
	}
	public static void printCompareResult(int result, MyDate date1, MyDate date2) {
		if (result == 1) {
			date2.print();
			System.out.print(" is the previous date of ");
			date1.print();
			System.out.println(" ");
		} else if(result == -1) {
			date1.print();
			System.out.print(" is the previous date of ");
			date2.print();
			System.out.println(" ");
		} else if (result == 0){
			date1.print();
			date2.print();
			System.out.println("are a same date!");
		}
	}
	public static void swapDate(MyDate d1, MyDate d2) {
		int tmpYear = d1.getYear();
		int tmpMonth= d1.getMonth();
		int tmpDay = d1.getDay();
		
		d1.setYear(d2.getYear());
		d2.setYear(tmpYear);
		
		d1.setMonth(d2.getMonth());
		d2.setMonth(tmpMonth);
		
		d1.setDay(d2.getDay());
		d2.setDay(tmpDay);
	}
	public static void sortDates(MyDate [] arrDates) {
		for (int i = 0; i < arrDates.length; i++) {
			for( int j = i + 1; j < arrDates.length; j ++) {
				if (DateUtils.compareTwoDates(arrDates[i],arrDates[j]) == 1) {
					swapDate(arrDates[i],arrDates[j]);
				}
			}
		}
		System.out.println("Sorting a number of dates:\n");
		for (int i = 0; i < arrDates.length; i++) {
			arrDates[i].print();
			System.out.println(" ");
		}
	}
}
