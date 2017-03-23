package GUI_50;

import javax.swing.JOptionPane;

class apples {
	public static void main(String[] args) {
	
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter second number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum  = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE); //First parameter - where to position the messagebox. Put null to position right in the center
												 //Second parameter - message text
												 //Third parameter - what should appear on the title bar
												 //Fourth parameter - for warning icons...not really sure on this one
	}
}
