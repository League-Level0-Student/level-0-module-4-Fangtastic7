//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickels1 = Integer.parseInt(nickels);
		double nickels2 = nickels1*0.05;
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes1 = Integer.parseInt(dimes);
		double dimes2 = dimes1*0.1;
		// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters1 = Integer.parseInt(quarters);
		double quarters2 = quarters1*0.25;
		// Calculate how much money the user has and save it in a double variable 
		double total = nickels2 + dimes2 + quarters2;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $" + total + " left.");
	}

	private static int quarters1(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int dimes1(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int nickels1(double d) {
		// TODO Auto-generated method stub
		return 0;
	}
}

