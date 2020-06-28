package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testscore {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("What was your test score? :)");
		double test = Double.parseDouble(score);
		if (test >= 90) {
			JOptionPane.showMessageDialog(null,"amazing job!!!!!!!!!!");
		}
		if (test < 90 && test >= 80) {
			JOptionPane.showMessageDialog(null,"good job");
		}
		if (test < 80 && test >= 70) {
			JOptionPane.showMessageDialog(null,"you did ok");
		}
		if (test < 70 && test >= 65) {
			JOptionPane.showMessageDialog(null,"try harder next time");	
		}
		if (test < 65 && test >= 0) {
			JOptionPane.showMessageDialog(null,"I advise actually studying ");

		}
			if (test < 30 && test >= 0) {
				JOptionPane.showMessageDialog(null,"why do you even try");	
			}
				
			
			
		
	}
}
