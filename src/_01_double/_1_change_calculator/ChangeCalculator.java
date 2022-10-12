package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String n = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int ni = Integer.parseInt(n);
		// Ask the user how many dimes they have, and convert their answer
String d = JOptionPane.showInputDialog("How many dimes do you have?");
int di = Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
String q = JOptionPane.showInputDialog("How many quarters do you have?");
int qu = Integer.parseInt(q);
		// Calculate how much money the user has.  Hint: Use a double variable 
double c = (0.25 * qu) + (0.10 * di) + (0.5 * di);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, "You have " + c + " dollars.");
	}
}

