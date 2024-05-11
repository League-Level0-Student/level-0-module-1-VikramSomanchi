package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddles1 = JOptionPane.showInputDialog("Some dinosaurs ate fish, but can't, why is that?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddles1.equalsIgnoreCase("they are already dead")) {
			JOptionPane.showMessageDialog(null, "your answer is correct");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "WRONGO, the answer was they are already dead");
		}
		// 6. Add some more riddles
		String riddles2 = JOptionPane.showInputDialog("I am your brother, but your not mine, what are you?");
		if(riddles2.equalsIgnoreCase("my sister")) {
			JOptionPane.showMessageDialog(null, "your answer is correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONGO, the correct answer was my sister");
		}
		String riddles3 = JOptionPane.showInputDialog("can frogs jump higher than the tallest skyscraper");
		if(riddles3.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "your answer is correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONGO, the correct answer was yes");
		}
		String riddles4 = JOptionPane.showInputDialog("What is greater than God,\n" + 
				"more evil than the devil,\n" + 
				"the poor have it,\n" + 
				"the rich need it,\n" + 
				"and if you eat it, you'll die?");
		if(riddles4.equalsIgnoreCase("Nothing")) {
			JOptionPane.showMessageDialog(null, "your answer is correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONGO, the correct answer was Nothing");
		}
		String riddles5 = JOptionPane.showInputDialog("Brothers and sisters I have none but this man's father is my father's son.\n" + 
				"Who is the man?");
		if(riddles5.equalsIgnoreCase("the man is my son")) {
			JOptionPane.showMessageDialog(null, "your answer is correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONGO, the correct answer was the man is my son");
		}
		String riddles6 = JOptionPane.showInputDialog("with food, I live. with water, I die. what am I?");
		if(riddles6.equalsIgnoreCase("fire")) {
			JOptionPane.showMessageDialog(null, "your answer is correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONGO, the correct answer was fire");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " +score);
	}
}

