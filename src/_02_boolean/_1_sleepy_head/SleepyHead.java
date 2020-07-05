package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
       String Answer =  JOptionPane.showInputDialog(null, "What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if ("Saturday".contentEquals(Answer)|| "Sunday" .contentEquals(Answer)) {
			isWeekend = true;

		}
					else isWeekend = false;
		// If it is the weekend, tell the user they get to sleep in.
		if (isWeekend){
			JOptionPane.showMessageDialog(null, "You can sleep in bud");
		}
		// If it is not the weekend, tell them to get out of bed and go to school!
		else {
		
			JOptionPane.showMessageDialog(null, "go to school");

		}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
String score = JOptionPane.showInputDialog(null, "What was your test score?");
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
double test = Double.parseDouble(score);
if (test >= 70) {
	JOptionPane.showMessageDialog(null, "congrats, you passed the test");
	
}
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
else {
	JOptionPane.showMessageDialog(null, "better luck next time");
}
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		isRed = false;
		
		String color = JOptionPane.showInputDialog("what color do you want to draw with?");
		if (color.equalsIgnoreCase("red"))
			isRed = true;
		boolean isSquare = false;		
		
// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog("what shape do you want to draw?");
		if(shape.equalsIgnoreCase("square"))
			isSquare = true;
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		if (isRed && isSquare) {
		drawRedSquare()	;
		
		}

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
		rob.penDown();
		rob.setPenColor(Color.RED);
		rob.setSpeed(100);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
	}	
	
}
