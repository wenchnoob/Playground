package com.point;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class MotionSimulator extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;

	private Thread thread;
	private boolean running;
	public static final int HEIGHT = 640, WIDTH = HEIGHT * 12/9;
	
	private int pointX, pointY;
	
	
	public MotionSimulator() {
		new Window(this);
	}
	
	
	@Override
	public void run() {
		while(running) {
			render();
		}
		stop();
	}
	
	public void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public void stop () {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {e.printStackTrace();}
	}
	
	public void renderPoint(Graphics g) {
		g.drawLine(WIDTH/2, HEIGHT/2, pointX, pointY);
		tick();
	}
	
	public void tick() {
		pointX += 1;
	}
	
	public void point() {
		pointX = 100;
		pointY = 100;
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		renderPoint(g);
		g.dispose();
		bs.show();
	}
	
	public static void main(String[] args) {
		new MotionSimulator();
	}
}

class Window extends Canvas {
	private static final long serialVersionUID = 1L;
	JFrame frame = new JFrame();
	public Window(MotionSimulator simulate) {
		Dimension dimension = new Dimension(MotionSimulator.WIDTH, MotionSimulator.HEIGHT);
		
		frame.setTitle("Motion Simulator");
		
		frame.setResizable(false);
		frame.setPreferredSize(dimension);
		frame.setMaximumSize(dimension);
		frame.setMinimumSize(dimension);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setAutoRequestFocus(true);
		frame.setLocationRelativeTo(null);
		
		
		
		frame.add(simulate);
		simulate.start();
	}
}

