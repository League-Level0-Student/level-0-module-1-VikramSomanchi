package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {

		String unbirthday = JOptionPane.showInputDialog("When is your birthbay MM/DD");
		if(unbirthday.equals("04/24")) {
			JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");
		}
		else {
			JOptionPane.showMessageDialog(null, "MERRY UNBIRTHDAY");
		}
	}
}
