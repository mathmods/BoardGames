package com.github.mathmods.boardgames.resource;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame {

	
	/**
	 * Computed the serialVersionUID
	 */
	private static final long serialVersionUID = 6291909893132919192L;

	public Frame(int[] args0, Tile[][] tiles){
		new JFrame();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(args0[0], args0[1]);
		this.setBounds(0, 0, args0[0], args0[1]);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setVisible(true);
		
		System.out.println("Made frame");
		
		Screen s = new Screen(this, tiles);
		this.add(s);		
	}
	
	public static void invoke(final int[] args0, final Tile[][] tiles){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new Frame(args0, tiles);
			}
		});
	}
	
	
}
