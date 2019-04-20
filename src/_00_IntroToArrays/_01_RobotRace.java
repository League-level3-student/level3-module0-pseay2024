package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
		public static void main(String[] args) {
			Robot[] r = new Robot[15];
			for (int i = 0; i < r.length; i++) {
				r[i] = new Robot();
				r[i].setX(400);
				r[i].setY(550);
				r[i].setSpeed(5000);
				r[i].turn(-90);
				r[i].move(10);
				r[i].turn(5);
			}
			Random rand = new Random();
			boolean isRacing = true;
			while (isRacing) {
				for (Robot bb8 : r) {
					if (bb8.getX() != 400 || bb8.getY() != 550) {
						if (rand.nextInt(2) == 0) {
							bb8.move(10);
							bb8.turn(5);
						}
					} else {
						JOptionPane.showMessageDialog(null, "A robot has won the race");
						isRacing = false;
					}
				}
			}
		}
}
