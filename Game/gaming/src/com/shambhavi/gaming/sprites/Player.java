package com.shambhavi.gaming.sprites;

import javax.imageio.ImageIO;

public class Player extends Sprite {
    public Player() throws Exception{
		x=20;
		y=400;
		w=100;
		h=100;
		speed = 4;
		bi= ImageIO.read(Player.class.getResource("player.GIF"));
	}
    //@Override
    public static void move() {
    	x=x+speed;
    }
        
}