package com.org.meritamerical.assignemnt2;

import acm.util.*;
import acm.program.GraphicsProgram;
import acm.graphics.*;

public class RandomCircles extends GraphicsProgram {
	private RandomGenerator rgen = new RandomGenerator();

	/*
	 * Below will create 10 circles at random position, radius, and color within a
	 * range for visibility I tried to do a for loop, with an array to create each
	 * object to go into the array for this, but would not let me create the array
	 * with defining the circle so would not let me do both in a sense I had to
	 * define it then that wouldn't satisfy the array requirements - I couldn't
	 * figure out how to get passed that issue.
	 */
	public void run() {
		int x1 = rgen.nextInt(0, 500);
		int y1 = rgen.nextInt(0, 500);
		double radius1 = rgen.nextDouble(0, 400);

		GOval circle1 = new GOval(x1, y1, radius1 * 2, radius1 * 2);
		circle1.setColor(rgen.nextColor());
		circle1.setFillColor(rgen.nextColor());
		circle1.setFilled(true);
		add(circle1);

		int x2 = rgen.nextInt(0, 500);
		int y2 = rgen.nextInt(0, 500);
		double radius2 = rgen.nextDouble(0, 400);

		GOval circle2 = new GOval(x2, y2, radius2 * 2, radius2 * 2);
		circle2.setColor(rgen.nextColor());
		circle2.setFillColor(rgen.nextColor());
		circle2.setFilled(true);
		add(circle2);

		int x3 = rgen.nextInt(0, 500);
		int y3 = rgen.nextInt(0, 500);
		double radius3 = rgen.nextDouble(0, 400);

		GOval circle3 = new GOval(x3, y3, radius3 * 2, radius3 * 2);
		circle3.setColor(rgen.nextColor());
		circle3.setFillColor(rgen.nextColor());
		circle3.setFilled(true);
		add(circle3);

		int x4 = rgen.nextInt(0, 500);
		int y4 = rgen.nextInt(0, 500);
		double radius4 = rgen.nextDouble(0, 400);

		GOval circle4 = new GOval(x4, y4, radius4 * 2, radius4 * 2);
		circle4.setColor(rgen.nextColor());
		circle4.setFillColor(rgen.nextColor());
		circle4.setFilled(true);
		add(circle4);

		int x5 = rgen.nextInt(0, 500);
		int y5 = rgen.nextInt(0, 500);
		double radius5 = rgen.nextDouble(0, 400);

		GOval circle5 = new GOval(x5, y5, radius5 * 2, radius5 * 2);
		circle5.setColor(rgen.nextColor());
		circle5.setFillColor(rgen.nextColor());
		circle5.setFilled(true);
		add(circle5);

		int x6 = rgen.nextInt(0, 500);
		int y6 = rgen.nextInt(0, 500);
		double radius6 = rgen.nextDouble(0, 400);

		GOval circle6 = new GOval(x6, y6, radius6 * 2, radius6 * 2);
		circle6.setColor(rgen.nextColor());
		circle6.setFillColor(rgen.nextColor());
		circle6.setFilled(true);
		add(circle6);

		int x7 = rgen.nextInt(0, 500);
		int y7 = rgen.nextInt(0, 500);
		double radius7 = rgen.nextDouble(0, 400);

		GOval circle7 = new GOval(x7, y7, radius7 * 2, radius7 * 2);
		circle7.setColor(rgen.nextColor());
		circle7.setFillColor(rgen.nextColor());
		circle7.setFilled(true);
		add(circle7);

		int x8 = rgen.nextInt(0, 500);
		int y8 = rgen.nextInt(0, 500);
		double radius8 = rgen.nextDouble(0, 400);

		GOval circle8 = new GOval(x8, y8, radius8 * 2, radius8 * 2);
		circle8.setColor(rgen.nextColor());
		circle8.setFillColor(rgen.nextColor());
		circle8.setFilled(true);
		add(circle8);

		int x9 = rgen.nextInt(0, 500);
		int y9 = rgen.nextInt(0, 500);
		double radius9 = rgen.nextDouble(0, 400);

		GOval circle9 = new GOval(x9, y9, radius9 * 2, radius9 * 2);
		circle9.setColor(rgen.nextColor());
		circle9.setFillColor(rgen.nextColor());
		circle9.setFilled(true);
		add(circle9);

		int x10 = rgen.nextInt(0, 500);
		int y10 = rgen.nextInt(0, 500);
		double radius10 = rgen.nextDouble(0, 400);

		GOval circle10 = new GOval(x10, y10, radius10 * 2, radius10 * 2);
		circle10.setColor(rgen.nextColor());
		circle10.setFillColor(rgen.nextColor());
		circle10.setFilled(true);
		add(circle10);
	}
}
