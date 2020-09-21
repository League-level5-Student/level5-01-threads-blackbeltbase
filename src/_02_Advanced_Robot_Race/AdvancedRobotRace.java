package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Thread[] rMove = new Thread[5];
	
	Random randoNum  = new Random();
	Robot[] robots = new Robot[5];
	for (int i = 0; i < 5; i++) {
		robots[i] = new Robot();
	}
	for (int i = 0; i < 5; i++) {
		robots[i].moveTo((i + 1) * 150, 600);
	}
	boolean isNotFinished = true;
	String winner = "";
	while(isNotFinished) {
		for(int i = 0; i<robots.length;i++) {
			if(robots[i].getY()<=0) {
				winner = "Robot "+(i+1);
				isNotFinished = false;
				break;
			}
			else {
				rMove[0] = new Thread(()->robots[0].move(randoNum.nextInt(50)));
				rMove[1] = new Thread(()->robots[1].move(randoNum.nextInt(50)));
				rMove[2] = new Thread(()->robots[2].move(randoNum.nextInt(50)));
				rMove[3] = new Thread(()->robots[3].move(randoNum.nextInt(50)));
				rMove[4] = new Thread(()->robots[4].move(randoNum.nextInt(50)));
				for(int k = 0; k<robots.length;k++) {
					rMove[k].start();
				}
			}
		}
	}
	JOptionPane.showMessageDialog(null,winner+" wins!");
	}
}
