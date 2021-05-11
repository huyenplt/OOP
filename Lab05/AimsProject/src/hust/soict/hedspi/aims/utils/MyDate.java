package hust.soict.hedspi.aims.utils;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private String toFormatMonth;
	private String toFormatDay;
	
	private String[] validDay = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", 
			"eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth","sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", 
			"twenty-first","twenty-second","twenty-third","twenty-fourth","twenty-fifth","twenty-sixth",
   		 	"twenty-seventh","twenty-eighth","twenty-ninth","thirtieth","thirty-first"};
	
	private List<String> validMonth = Arrays.asList("January", "February", "March",
			"April", "May", "June", "July", "August", "September", "October", "November",
			"December", "Jan.", "Feb.", "Mar.", "Apr.", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.",
            "Jan","Feb","Mar","Apr","Jul","Aug","Aug","Sep","Oct","Nov","Dec");
	
	private String[] validYear = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
		   	"eleven", "twelve","thirteen", "fourteen","fifteen","sixteen","seventeen","eighteen", 
		   	"nineteen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
   
	private int[] sourceYear = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
		   20, 30, 40, 50, 60, 70, 80, 90};
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day >= 0 && day <= getDaysOfMonth(month, year)) 
			this.day = day;
		else {
			System.out.println("Error: Invalid day");
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 && month <= 12) 
			this.month = month;
		else {
			System.out.println("Error: Invalid month");
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 0) 
			this.year = year;
		else {
			System.out.println("Error: Invalid year");
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
		if((day >=1 && day <=31) && (month >=1 && month <= 12) && (year >= 0)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else{
            if(day < 1 || day > 31)
                System.out.println("Error : Invalid day");
            if(month < 1 || month > 12)
                System.out.println("Error : Invalid month");
            if (year < 0)
                System.out.println("Error : Invalid year");
       }
	}
	
	private int getDaysOfMonth (int month, int year) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		else if(month == 2) {
			if(year % 4 == 0)
				return 29;
			else 
				return 28;
		}
		else return 30;
	}
	
	private static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	private int toValidDay(String strDay) {
		int day;
		if(isNumeric(strDay)) 
			day = Integer.parseInt(strDay);
		else {
			String dayFormat = strDay.substring(strDay.length()-2).toLowerCase();
			if(dayFormat.equals("st")||dayFormat.equals("nd")||dayFormat.equals("rd")||dayFormat.equals("th")) {
				strDay = strDay.substring(0, strDay.length()-2);
				day = Integer.parseInt(strDay);
			}
			else return 0;
		}
		if (day >= 1 && day <=31){
			return day;
		}
		else 
			return 0;
	}
	
	private int toValidMonth(String strMonth, List<String> validMonth) {
		if(isNumeric(strMonth) && Integer.parseInt(strMonth) >= 1 && Integer.parseInt(strMonth) <=12)
			return Integer.parseInt(strMonth);
		if(validMonth.stream().filter(mon -> mon.toLowerCase().equals(strMonth.toLowerCase())).findFirst() != null) {
			String mon = strMonth.toLowerCase();
			if(mon.equals("january") || mon.equals("jan.") || mon.equals("jan"))
				return 1;
			if(mon.equals("february") || mon.equals("feb.") || mon.equals("feb"))
				return 2;
			if(mon.equals("march") || mon.equals("mar.") || mon.equals("mar"))
				return 3;
			if(mon.equals("april") || mon.equals("apr.") || mon.equals("apr"))
				return 4;
			if(mon.equals("may"))
				return 5;
			if(mon.equals("june") || mon.equals("jun"))
				return 6;
			if(mon.equals("july") || mon.equals("jul"))
				return 7;
			if(mon.equals("august") || mon.equals("aug.") || mon.equals("aug"))
				return 8;
			if(mon.equals("september") || mon.equals("sep.") || mon.equals("sep"))
				return 9;
			if(mon.equals("october") || mon.equals("oct.") || mon.equals("oct"))
				return 10;
			if(mon.equals("november") || mon.equals("nov.") || mon.equals("nov"))
				return 11;
			if(mon.equals("december") || mon.equals("dec.") || mon.equals("dec"))
				return 12;
		}
		return 0;
	}
	
	private int[] checkValidDate(String strDate) {
		String[] datePart = strDate.split(" ");
		String strDay = datePart[1];
		String strMonth = datePart[0];
		String strYear = datePart[2];	
		int day = toValidDay(strDay);
		int month = toValidMonth(strMonth, validMonth);
		int year = Integer.parseInt(strYear);
		int[] date = {day, month, year};
		return date;
	}
	
	public MyDate(String strDate) {
		String[] datePart = strDate.split(" ");
		String strDay = datePart[1];
		String strMonth = datePart[0];
		String strYear = datePart[2];	
		this.day = toValidDay(strDay);
		this.month = toValidMonth(strMonth, validMonth);
		this.year = Integer.parseInt(strYear);
	}
	
	
	public void accept() {
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Please enter a date (e.g.: February 18th 2019): ");
		String strDate = Keyboard.nextLine();
		int[] date = checkValidDate(strDate);
		this.day = date[0];
		this.month = date [1];
		this.year = date [2];

		System.out.println("day: " + this.day+", month: " + this.month+", year: " + this.year);

		Keyboard.close();
	}
	
	private int toValidDay(String day, String[] validDay) {
    	String d = day.toLowerCase();
    	for(int i = 0; i < validDay.length; i++ ){
    		if(d.equals(validDay[i])) 
    			return i+1;
    	}
    	return 0;
    }
	
	private int toValidYear(String strYear, String[] validYear) {
    	int year = 0;
    	String y = strYear.toLowerCase();
    	String[] yearItems = y.split("\\s");
    	if(yearItems.length == 2) {
    		if(yearItems[0].equals("two") && yearItems[1].equals("thousand")) {
    			year = 2000;
    		}
    		
    		else {
    			for(int i = 0; i < validYear.length; i++) {
    				if(yearItems[0].equals(validYear[i])) 
    					year += sourceYear[i]*100;
    				
    				if(yearItems[1].equals(validYear[i])) 
    					year += sourceYear[i];
    			}
    		}
    		
    	} 
    	else if(yearItems.length == 3) {
    		if(yearItems[0].equals("two") && yearItems[1].equals("thousand")) {
    			year = 2000;
    			for(int i = 0; i < validYear.length; i++) {
    				if(yearItems[2].equals(validYear[i])) 
    					year += sourceYear[i];
    			}
    		} 
    		
    		else {
	    		for(int i = 0; i < validYear.length; i++) {
					if(yearItems[0].equals(validYear[i])) 
						year += sourceYear[i]*100;
					
					if(yearItems[1].equals(validYear[i])) 
						year += sourceYear[i];
				
					if(yearItems[2].equals(validYear[i])) 
						year += sourceYear[i];
				}
    		}
    	} 
    	return year;
    }
	
	private int[] validDate(String strDay, String strMonth, String strYear) {
		int flag = 0;
		int day = toValidDay(strDay,validDay);
		int month = toValidMonth(strMonth,validMonth);
		int year = toValidYear(strYear,validYear);
		
		if (day == 0) {
			 System.out.println("Invalid Day!");
	         flag = 1;
		}
		
		if (month == 0) {
			 System.out.println("Invalid Month!");
	         flag = 1;
		}
		
	    if(year == 0) {
	         System.out.println("Invalid Year!");
	         flag = 1;
	    }
	    
		if(flag == 0) {
	            if(day <= getDaysOfMonth(month,year)) {
	                int[] Date = {day, month, year};
	                return Date;
	            }
	            else{
	                System.out.println("Invalid date!");
	                return null;
	            }
	        }
	        else 
	            return null;
	}
	
	public MyDate(String day, String month, String year) {	
		int [] date = validDate(day, month, year);
	     if(date != null){
	            this.day = date[0];
	            this.month = date[1];
	            this.year = date[2];
	     }
	}
	
	public void print() {
		// System.out.print("Today is "+ this.day + " / " + this.month+ " / " + this.year);
		switch (this.month) {
		case 1: this.toFormatMonth = "January"; break;
		case 2: this.toFormatMonth = "February"; break;
		case 3: this.toFormatMonth = "March"; break;
		case 4: this.toFormatMonth = "April"; break;
		case 5: this.toFormatMonth = "May"; break;
		case 6: this.toFormatMonth = "June"; break;
		case 7: this.toFormatMonth = "July"; break;
		case 8: this.toFormatMonth = "August"; break;
		case 9: this.toFormatMonth = "September"; break;
		case 10: this.toFormatMonth = "Octorber"; break;
		case 11: this.toFormatMonth = "November"; break;
		case 12: this.toFormatMonth = "December"; break;
		}
		
		if (this.day == 1) toFormatDay = "1st";
		else if (this.day == 2) toFormatDay = "2nd";
		else if (this.day == 3) toFormatDay = "3rd";
		else this.toFormatDay = this.day + "th";
		
		System.out.print(this.toFormatMonth + " " + this.toFormatDay + " " + this.year );
	}
	
	public static void print(int choice) {
		Date date = new Date(); 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    String strDate = formatter.format(date);
		if(choice == 1) {
			System.out.println(strDate);
		} else if (choice == 2) {
			formatter = new SimpleDateFormat("d/M/yyyy");
		    strDate = formatter.format(date);
		    System.out.println(strDate);
		} else if (choice == 3) {
			formatter = new SimpleDateFormat("dd-MMM-yyyy");
		    strDate = formatter.format(date);
		    System.out.println(strDate);
		} else if (choice == 4) {
			formatter = new SimpleDateFormat("MMM d yyyy");
		    strDate = formatter.format(date);
		    System.out.println(strDate);
		} else if (choice == 5) {
			formatter = new SimpleDateFormat("MM-dd-yyyy");
		    strDate = formatter.format(date);
		    System.out.println(strDate);
		} 
	}
	

}