package com.org.meritamerical.assignemnt2;

import acm.program.GraphicsProgram;

import java.awt.Frame;
import java.awt.event.*;
import acm.graphics.*;
import javax.swing.*;

public class DrwaLine extends GraphicsProgram {
//This creates a line from the user start and end.
	public void run() {
		addMouseListeners();
		addMouseMothionListeners();
		JFrame frame = new JFrame("Rubber Lines");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new DrwaLine());
		frame.pack();
		frame.setVisible(true);

	}
	
	private void addMouseMothionListeners() {
		
	}

	public void mousePressed(MouseEvent e) {
		startX = e.getX();
		startY = e.getY();
		endX = e.getX();
		endY = e.getY();
		currentLine.setVisible(true);
		currentLine = new GLine(startX, startY, startX, startY);
		add(currentLine);
	}

	public void mouseMoved(MouseEvent e) {
		double x = Math.min(e.getX(), startX);
		double y = Math.min(e.getY(), startY);
		double xx = Math.min(e.getX(), endX);
		double yy = Math.min(e.getY(), endY);
		currentLine.getBounds();
		currentLine.addActionListener(this);
		currentLine.setVisible(true);
		currentLine.addMouseMotionListener(this);

		
	}

	public void mouseDragged(MouseEvent e) {
		double x = Math.min(e.getX(), startX);
		double y = Math.min(e.getY(), startY);
		double xx = Math.min(e.getX(), endX);
		double yy = Math.min(e.getY(), endY);
		currentLine = new GLine(startX, startY, endX, endY);
		currentLine.getBounds();
		currentLine.setVisible(true);
		currentLine.addMouseListener(this);

	}

	public void mouseReleased(MouseEvent e) {
		endX = e.getX();
		endY = e.getY();
		currentLine = new GLine(startX, startY, endX, endY);
		currentLine.setVisible(true);
		currentLine.setEndPoint(endX, endY);
		add(currentLine);
	}


	private GLine currentLine;
	private double startX;
	private double startY;
	private double endX;
	private double endY;
}
