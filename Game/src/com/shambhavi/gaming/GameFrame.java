package com.shambhavi.gaming;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	// Constructor
	GameFrame() throws Exception{
		Board board = new Board();
		this.setSize(1000,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Game - 2022");
		setLocationRelativeTo(null);
		add(board);
		setVisible(true);

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		GameFrame obj = new GameFrame();
		
	}

}