package com.org.meritamerical.assignemnt2;

import acm.program.GraphicsProgram;
import java.awt.Color;
import acm.graphics.*;

public class DrawFace2 extends GraphicsProgram {
	//Defines my constant variables - x and y set to zero for visibility
	final int x = getWidth();
	final int y = getHeight();
	final int HEAD_WIDTH = (x - x + 800);
	final int HEAD_HEIGHT = (y - y + 1000);
	final int MOUTH_HEIGHT = (HEAD_HEIGHT / 50);
	final double MOUTH_WIDTH = (HEAD_WIDTH * .65);
	final int EYE_RADIUS = 50;

	public void run() {
		/*
		 * This sets the position of the head - the reason I have this set to 0 in
		 * relation to getWidth & getHeight (x-x) & (y-y) is because I can't see my face
		 * when I divide x or y by given value as the Graphics console extends beyond
		 * view and does not provide scrolling abilities. This sets the basis for all
		 * mouth and both eye x & y positional coordinates.
		 */
		int headX = (x - x + 400);
		int headY = (y - y + 100);

		// Creates the head
		GRect head = new GRect(headX, headY, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFillColor(Color.GRAY);
		head.setFilled(true);
		add(head);

		// Sets the mouth x & y coordinates and creates the mouth
		int mouthX = ((headX / 3) + headX);
		int mouthY = ((headY * 7) + headY);
		GRect mouth = new GRect(mouthX, mouthY, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setColor(Color.WHITE);
		mouth.setFillColor(Color.WHITE);
		mouth.setFilled(true);
		add(mouth);

		// Sets the eye1 (left eye) x & y coordinates and creates eye1 (left eye)
		int eye1x = ((headX / 3) + headX);
		double eye1y = ((headY * 1.5) + headY);
		GOval eye1 = new GOval(eye1x, eye1y, EYE_RADIUS * 2, EYE_RADIUS * 2);
		eye1.setColor(Color.YELLOW);
		eye1.setFillColor(Color.YELLOW);
		eye1.setFilled(true);
		add(eye1);

		// Sets the eye2 (right eye) x & y coordinates and creates eye2 (right eye)
		double eye2x = (eye1x * 1.75);
		double eye2y = ((headY * 1.5) + headY);
		GOval eye2 = new GOval(eye2x, eye2y, EYE_RADIUS * 2, EYE_RADIUS * 2);
		eye2.setColor(Color.YELLOW);
		eye2.setFillColor(Color.YELLOW);
		eye2.setFilled(true);
		add(eye2);

	}
}
