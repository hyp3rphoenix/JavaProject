package Game;

import java.awt.Color;
import java.awt.Graphics;

import reference.*;

public class Walker {
	Point pos;
	int size;
	int speed;
	
	int w, h;
	
	public Walker(int size, int width, int height) {
		pos = new Point(0, 0);
		this.size = size;
		speed = size;
		
		w = width;
		h = height;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(pos.x, pos.y, size, size);
	}
	
	public void move(int dir) {
		switch(dir) {
			case 1: //UP
				pos.y -= speed;
				break;
			case 2: //DOWN
				pos.y += speed;
				break;
			case 3: //LEFT
				pos.x -= speed;
				break;
			case 4: //RIGHT
				pos.x += speed;
				break;
		}
		
		boundary();
	}
	
	public void boundary() {
		if(pos.x > w) {
			pos.x = 0;
		}
		else if(pos.x < 0) {
			pos.x = w;
		}
		else if(pos.y > h) {
			pos.y = 0;
		}
		else if(pos.y < 0) {
			pos.y = h;
		}
	}
	
}
