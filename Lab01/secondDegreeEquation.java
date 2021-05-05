import javax.swing.JOptionPane;
public class secondDegreeEquation {
	public static void main(String[] args) {
		String stra, strb, strc;
		double delta, x1, x2;
		String strNoti; 
		
		JOptionPane.showMessageDialog(null, "Given a second-degree equation:\n"
				+ " ax^2 + bx + c = 0\n"
				+ " Please enter constants a, b, c");
		
		stra = JOptionPane.showInputDialog(null, 
				"Please enter constant a (a khác 0): ");
		double a = Double.parseDouble(stra);
		
		strb = JOptionPane.showInputDialog(null, 
				"Please enter constant b: ");
		double b = Double.parseDouble(strb);

		strc = JOptionPane.showInputDialog(null, 
				"Please enter constant c: ");
		double c = Double.parseDouble(strc);
		
		delta = b*b - 4*a*c;
		if(delta < 0) {
			strNoti = "Phương trình vô nghiệm";
		}
		else if(delta == 0) {
			double result = (-b/2*a);
			strNoti = "Phương trình có nghiệm kép\n"
					+ "x1 = x2 = " + result;
		}
		else {
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
			strNoti = "Phương trình có 2 nghiệm phân biệt\n"
					+ "x1 = " + x1 + "\n"
					+ "x2 = " + x2 + "\n";
		}
		
		JOptionPane.showMessageDialog(null, strNoti);
		System.exit(0);
	}
}
