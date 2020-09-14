package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
	Robot robot = new Robot();
	Robot robot2 = new Robot();
	Robot robot3 = new Robot();
	Robot robot4 = new Robot();
	Robot robot5 = new Robot();
	robot.setSpeed(10);
	robot2.setSpeed(10);
	robot3.setSpeed(10);
	robot4.setSpeed(10);
	robot5.setSpeed(10);
	robot.setPenColor(Color.blue);
	robot2.setPenColor(Color.black);
	robot3.setPenColor(Color.red);
	robot4.setPenColor(Color.yellow);
	robot5.setPenColor(Color.green);
	robot.moveTo(300,300);
	robot2.moveTo(450,300);
	robot3.moveTo(600,300);
	robot4.moveTo(350,450);
	robot5.moveTo(500,450);
	robot.penDown();
	robot2.penDown();
	robot3.penDown();
	robot4.penDown();
	robot5.penDown();
	for(int i = 0;i<360;i++) {
	Thread r1c = new Thread(()->robot.move(1));
	Thread r2c = new Thread(()->robot2.move(1));
	Thread r3c = new Thread(()->robot3.move(1));
	Thread r4c = new Thread(()->robot4.move(1));
	Thread r5c = new Thread(()->robot5.move(1));
	r1c.start();
	r2c.start();
	r3c.start();
	r4c.start();
	r5c.start();
	Thread r1d = new Thread(()->robot.turn(1));
	Thread r2d = new Thread(()->robot2.turn(1));
	Thread r3d = new Thread(()->robot3.turn(1));
	Thread r4d = new Thread(()->robot4.turn(1));
	Thread r5d = new Thread(()->robot5.turn(1));
	r1d.start();
	r2d.start();
	r3d.start();
	r4d.start();
	r5d.start();
	}
}
}

