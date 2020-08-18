package com.array;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Visualizer extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	
	private static final int WIDTH = 1000, HEIGHT = 480;
	
	private Thread thread;
	private boolean running;
	
	private Random r = new Random();
	
	
	private int lineWidth = 3;
	private int[] lines = new int[WIDTH/lineWidth];
	
	public Visualizer() {
		populate();
		new Window(WIDTH, HEIGHT, this);
		bubbleSort();
		//selectionSort();
	}
	
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
	
	public void stop() {
		try {
			thread.join();
			running = false;
		} catch (Exception e) {e.printStackTrace();}
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		Graphics2D g2D = (Graphics2D)g;
		g.setColor(Color.BLACK);
		g2D.setStroke(new BasicStroke(lineWidth));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.WHITE);
		visualize(g);
		g.dispose();
		bs.show();
	}
	
	private void visualize(Graphics g) {
		for(int i = 0; i < lines.length; i++) {
			g.drawLine(i + (lineWidth*i), 0, i + (lineWidth*i), lines[i]);
		}
	}
	
	public void bubbleSort() {
		for(int i = 0; i < lines.length - 1; i ++) {
			for(int j = 0; j < lines.length - 1; j ++) {
				if(lines[j] > lines[j+1]) {
					int temp = lines[j];
					lines[j] = lines[j+1];
					lines[j+1] = temp;
					render();
				}
			}
		}
	}
	
	public void selectionSort() {
		int smallest = Integer.MAX_VALUE;
		int index = 0;
		
		for(int i = 0; i < lines.length; i++) {
			for(int j = i; j < lines.length; j++) {
				if(lines[j] < smallest) {
					smallest = lines[j];
					index = j;
				}
			}
			int temp = lines[i];
			lines[i] = smallest;
			lines[index] = temp;
			smallest = Integer.MAX_VALUE;
			render();
		}
	}
	
	private void populate() {
		for(int i = 0; i < lines.length; i++) {
			lines[i] = r.nextInt(HEIGHT/2);
		}
	}
	
	public static void main(String[] args) {
		new Visualizer();
	}
}
