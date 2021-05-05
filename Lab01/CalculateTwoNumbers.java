import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		double sum, diff, prod, quot;
		String strNoti;
		
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ",
				"Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ",
				"Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		
		sum = num1 + num2;
		diff = num1 - num2;
		prod = num1 * num2;
		
		if(num2 == 0) {
			strNoti = "Sum: " + sum + "\n"
					+ "Diff: " + diff + "\n"
					+ "Prod: " + prod + "\n"
					+ "Quot can't be calculated";
		}
		else {
			quot = num1 / num2;
			strNoti = "Sum: " + sum + "\n"
					+ "Diff: " + diff + "\n"
					+ "Prod: " + prod + "\n"
					+ "Quot: " + quot;
		}
		
		JOptionPane.showMessageDialog(null, strNoti);
		System.exit(0);
	}
}
