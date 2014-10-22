package com.github.mathmods.boardgames.resource;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame {

	public Screen s;
	
	public static Frame invoke(final int[] args0, final Tile[][] tiles){
		/**SwingUtilities.invokeLater(new Runnable(){
			*@Override
			*public void run() {*/
				return new Frame(args0, tiles);
			/**}
		*});
	*/}
	
	public Frame(int[] args0, Tile[][] tiles){
		new JFrame();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(args0[0], args0[1]);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setVisible(true);
		
		System.out.println("Made frame");
		
		s = new Screen(this, tiles);
		this.add(s);
	}
}
