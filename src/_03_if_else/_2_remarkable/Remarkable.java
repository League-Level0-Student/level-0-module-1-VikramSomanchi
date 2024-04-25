package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String mom = "she created her own job idea, and called it sankalp.";
		String dad = "he created the idea of the V-verse stickers.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("insert a name please");
		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (name.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, mom);
		} else if (name.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dad);
		} else {
			JOptionPane.showMessageDialog(null, "Your options are Mom or Dad, " + name + " is not an answer.");
		}
	}
}
