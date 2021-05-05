
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate("Feb 18th 2019");
		System.out.println(date1.getDay());
		
		MyDate date2 = new MyDate();
		date2.accept();
		date2.print();
		
		
	}

}
