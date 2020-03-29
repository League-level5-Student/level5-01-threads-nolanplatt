package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {
		
		OlympicRings_Threaded or = new OlympicRings_Threaded();
	}
	
OlympicRings_Threaded() {		
	
	Robot r1 = new Robot(670, 300);
	Robot r2 = new Robot(770, 450);
	Robot r3 = new Robot(870, 300);
	Robot r4 = new Robot(970, 450);
	Robot r5 = new Robot(1070, 300);

	
	r1.setSpeed(10);
	r2.setSpeed(10);
	r3.setSpeed(10);
	r4.setSpeed(10);
	r5.setSpeed(10);
	
	r1.penDown();
	r2.penDown();
	r3.penDown();
	r4.penDown();
	r5.penDown();
	
	Thread tr1 = new Thread(()->drawCircle(r1));
	Thread tr2 = new Thread(()->drawCircle(r2));
	Thread tr3 = new Thread(()->drawCircle(r3));
	Thread tr4 = new Thread(()->drawCircle(r4));
	Thread tr5 = new Thread(()->drawCircle(r5));

	tr1.start();
	tr2.start();
	tr3.start();
	tr4.start();
	tr5.start();
	
	}
	
	void drawCircle(Robot r) {
		for (int i = 0; i < 360; i++) {
			r.move(1);
			r.turn(1);
		}
	}
}

