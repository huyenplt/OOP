import javax.swing.JOptionPane;
public class FirstDegreeEquation {
	public static void main(String[] args) {
		String stra, strb;
		String strNoti;
		JOptionPane.showMessageDialog(null, "Given a first-degree equation: ax + b = 0. Please enter constants a, b");
		
		stra = JOptionPane.showInputDialog(null, 
				"Please enter constant a: ",
				"ax + b = 0",
				JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(stra);
		
		strb = JOptionPane.showInputDialog(null, 
				"Please enter constant b: ",
				"ax + b = 0",
				JOptionPane.INFORMATION_MESSAGE);
		double b = Double.parseDouble(strb);
		
		if(a != 0) {
			double result = -b/a;
			strNoti = "x = " +result;
		}
		else {
			if (b == 0) {
				strNoti = "phương trình có vô số nghiệm x ";
			}
			else {
				strNoti = "No solution!";
			}
		}
		JOptionPane.showMessageDialog(null, strNoti);
		System.exit(0);
	}
}
