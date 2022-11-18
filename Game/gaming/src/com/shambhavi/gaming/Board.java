package com.shambhavi.gaming;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.shambhavi.gaming.sprites.Enemy;
import com.shambhavi.gaming.sprites.Player;


// Constructor 
	BufferedImage bi ;
	Player player;
	//Enemy enemy;
	Enemy enemies[];
	//throw early catch later
	public Board() throws Exception{
		setSize(1000,600);
		bi = ImageIO.read(Board.class.getResource("Game.jpg"));
		player = new Player();
	    enemies = new Enemy[3];//all enemies are null initial
	    loadEnemies();
	    setFocusable(true);
	    bindEvents();
	    gameLoop();
	    
	}
	  void bindEvents() {
		  this.addKeyListener(new KeyAdapter(){
			  @Override
			  public void keyPressed(KeyEvent e) {
			  //TODO Auto-generated method stub
				  player.move();
				if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
					  Player.move();
				  }
			  });
	}
	void gameLoop() {
		  //Delay
		  Timer timer= new Timer(100,new ActionListener() {
			  
			  @Override
			  public void actionPerformed(ActionEvent e) {
				  //TODO Auto-generated method stub
				  //System.out.printIn("Timer call");
				  repaint();
				  
			  }
		  });
		  timer.start();
	  }
	void loadEnemies()throws IOException
	{
		int x=200;
		int speed=2;
		final int GAP= 200;
		for(int i=0;i<enemies.length;i++) {
            enemies[i]=new Enemy(x,speed);        ;
			x=x+GAP;
			speed+=4;
			
		}
	}
	void printEnemies(Graphics pen) {
		for(Enemy e:enemies){
			e.draw(pen);
			e.move();
		    e.outofScreen();
		}
	}
	// Painting on Board
	@Override//when you inherit any class then you have chances to change that propertyE.g Michael Jackson
	public void  paintComponent(Graphics pen){
//		pen.setColor(Color.RED);
//		pen.fillRect(10, 50, 70, 50);
//		pen.drawRect(20, 100, 100, 100);
//		pen.drawOval(300, 50, 100, 100);
//		pen.setFont(new Font("times", Font.BOLD, 50));
//		pen.drawString("Game 2022", 300, 300);
		pen.drawImage(bi,0,0,1000,600, null);
		player.draw(pen);
		//enemy.draw(pen);
		printEnemies(pen);
		
		
	}

}



