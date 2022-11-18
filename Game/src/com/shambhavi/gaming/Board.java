package com.shambhavi.gaming;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings({ "unused", "serial" })
public class Board extends JPanel{
	
	// Constructor (Initialize)
	BufferedImage bi ;
	Board() throws Exception{
		setSize(1000,600);
		bi = ImageIO.read(Board.class.getResource("game-bg.jpeg"));
		 
	
	}
	
	// Painting on Board
	@Override
	public void  paintComponent(Graphics pen){
//		pen.setColor(Color.RED);
//		pen.fillRect(10, 50, 70, 50);
//		pen.drawRect(20, 100, 100, 100);
//		pen.drawOval(300, 50, 100, 100);
//		pen.setFont(new Font("times", Font.BOLD, 50));
//		pen.drawString("Game 2022", 300, 300);
		pen.drawImage(bi,0,0,1000,600, null);
		
	}

}