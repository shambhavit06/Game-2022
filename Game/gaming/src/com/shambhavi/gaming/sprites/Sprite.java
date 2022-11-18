package com.shambhavi.gaming.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Sprite {
	
	int x;
	int y;
	int w;
	int h;
	BufferedImage bi;
	static int speed;
	
	public void draw(Graphics pen)
	{
		pen.drawImage(bi, x, y, x, y, x, y, x, y, null);
	}
    public abstract void move();
}
