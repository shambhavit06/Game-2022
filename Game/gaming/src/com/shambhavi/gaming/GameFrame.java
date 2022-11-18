package com.shambhavi.gaming;


import javax.swing.JFrame;

public class GameFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Constructor 
	GameFrame() throws Exception{
		Board board = new Board();
		
		this.setSize(1000,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Game- 2022");
		setLocationRelativeTo(null);
		this.add(board);
		setVisible(true);

	}
    
	//Timer (Internally thread)-GameLOOP
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
//      TODO Auto-generated method stud
		var obj= new GameFrame();
		System.out.println(Thread.currentThread());
//      obj.setSize(700,500);
//      obj.setDefaultCloseOperation(JFrame.Exit_ON_CLOSE);
//      obj.setVisible(true);
		}

}
