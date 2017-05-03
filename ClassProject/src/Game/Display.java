package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Display extends JPanel implements KeyListener, ActionListener {
	
	
	
	int width = 500;
	int height = 495;
	
	Walker w = new Walker(10, width, height);
	
	int direction = 4;
	
	public Display(String s) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Display d = new Display();
		new Display();
		frame.addKeyListener(d);
		frame.add(d);
		frame.setSize(width, height);
		frame.setVisible(true);
		System.out.println("Hi");
	}
	
	private static final long serialVersionUID = 1L;
	private static int delay = 5;
	protected Timer timer;
	
	
	public Display() {
		timer = new Timer(delay, this);
		timer.start();
	}
	
	public static void main(String[] args) {
		Display d = new Display("");
	}
	
	public void draw(Graphics g, int x, int y) {
		g.setColor(Color.red);
		g.fillRect(x, y, 25, 25);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
			case KeyEvent.VK_D:
				direction = 4;
				break;
			case KeyEvent.VK_A:
				direction = 3;
				break;
			case KeyEvent.VK_S:
				direction = 2;
				break;
			case KeyEvent.VK_W:
				direction = 1;
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	int moveCounter = 30;
	public void increment() {
		if(moveCounter == 0) {
			w.move(direction);
			moveCounter = 30;
		}
		else {
			moveCounter--;
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		w.draw(g);
		
		increment();
	}
	
	
	int counter = 10;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		repaint();
	}
	
}
