package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScore {
	
	public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog("What was your test score?");

int per = Integer.parseInt(score);
if (per >= 90) {
	JOptionPane.showMessageDialog(null, "Great job! You aced it!");
}
else if (per >= 80) {
	JOptionPane.showMessageDialog(null, "Good job on the test!");
}
else if (per >= 70) {
	JOptionPane.showMessageDialog(null, "Well, you passed the test!");
}
else if (per < 70) {
	JOptionPane.showMessageDialog(null, "Yikes, better luck next time...");
}
}
}