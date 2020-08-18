package com.array;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{
	private static final long serialVersionUID = 1L;

	public Window(int width, int height, Visualizer visuals) {
		JFrame frame = new JFrame();
		frame.setTitle("Visualizer");
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setResizable(false);
		frame.setVisible(true);
		
		frame.setAutoRequestFocus(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(visuals);
		visuals.start();
	}
}
