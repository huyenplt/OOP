import javax.swing.JOptionPane;
public class systemOfFirstDegreeEquations {
	public static void main(String[] args) {
		String stra1, stra2, strb1, strb2, strc1, strc2;
		String strNoti;
		double det, x, y;
		
		JOptionPane.showMessageDialog(null, "Given a system of first-degree equations:\n"
				+ " a1x + b1y = c1\n"
				+ " a2x + b2y = c2\n"
				+ " Please enter constants a1, b1, c1, a2, b2, c2");
		
		stra1 = JOptionPane.showInputDialog(null, 
				"Please enter constant a1: ");
		double a1 = Double.parseDouble(stra1);
		
		strb1 = JOptionPane.showInputDialog(null, 
				"Please enter constant b1: ");
		double b1 = Double.parseDouble(strb1);

		strc1 = JOptionPane.showInputDialog(null, 
				"Please enter constant c1: ");
		double c1 = Double.parseDouble(strc1);
		
		stra2 = JOptionPane.showInputDialog(null, 
				"Please enter constant a2: ");
		double a2 = Double.parseDouble(stra2);
		
		strb2 = JOptionPane.showInputDialog(null, 
				"Please enter constant b2: ");
		double b2 = Double.parseDouble(strb2);
		
		strc2 = JOptionPane.showInputDialog(null, 
				"Please enter constant c2: ");
		double c2 = Double.parseDouble(strc2);
		
		det = a1 * b2 - a2 * b1;
		
		if(det == 0) {
			strNoti = "Hệ phương trình vô nghiệm ";
		}
		else {
			x = (c1 * b2 - c2 * b1) / det;
			y = (a1 * c2 - c1 * a2) / det;
			
			strNoti = "Hệ phương trình có nghiệm: \n"
					+"x = " + x + "\n"
					+"y = " + y + "\n";
 		}
		
		JOptionPane.showMessageDialog(null, strNoti);
		System.exit(0);
	}
}
