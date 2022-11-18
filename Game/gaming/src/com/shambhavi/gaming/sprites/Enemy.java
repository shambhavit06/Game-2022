package com.shambhavi.gaming.sprites;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Enemy extends Sprite{
	public Enemy(int x, int speed)throws IOException{
		this.x=x;
		y=40;
		w=100;
		h=100;
		this.speed=speed;
		bi=ImageIO.read(Enemy.class.getResource("enemy.GIF"));
	}
	public void move() {
		y=y+speed;
	}
	public void outofScreen() {
		if(y>600) {
			y= 40;
		}
	}

}
