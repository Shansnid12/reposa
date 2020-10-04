package com.org.meritamerical.assignemnt2;

import acm.program.*;
import acm.util.*;

import java.awt.Color;

import acm.graphics.*;


public class DrawFace extends GraphicsProgram {
	public void run() {
		final int HEAD_WIDTH = 1000;
		final int HEAD_HEIGHT = 800;
		final int EYE_RADIUS = 50;
		final int MOUTH_WIDTH = 500;
		final int MOUTH_HEIGHT = 80;
		
	GRect head = new GRect(400,75,HEAD_WIDTH,HEAD_HEIGHT);
	head.setFillColor(Color.GRAY);
	head.setFilled(true);
	add(head);
	GRect mouth = new GRect(650,600,MOUTH_WIDTH,MOUTH_HEIGHT);
	add(mouth);
	mouth.setColor(Color.WHITE);
	mouth.setFillColor(Color.WHITE);
	mouth.setFilled(true);
	GOval eye1 = new GOval(650,200,EYE_RADIUS*2,EYE_RADIUS*2);
	add(eye1);
	eye1.setColor(Color.YELLOW);
	eye1.setFillColor(Color.YELLOW);
	eye1.setFilled(true);
	GOval eye2 = new GOval(1050,200,EYE_RADIUS*2,EYE_RADIUS*2);
	eye2.setColor(Color.YELLOW);
	eye2.setFillColor(Color.YELLOW);
	eye2.setFilled(true);
	add(eye2);
	
	}
}
