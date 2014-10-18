package com.github.mathmods.boardgames.resource;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel implements Runnable {

	/**
	 * Computed the serialVersionUID
	 */
	private static final long serialVersionUID = -4954297815886804142L;
	
	Thread thread = new Thread(this);
	Frame frame;
	Tile[][] tiles;
	public static boolean running = false;
	
	public Screen(Frame frame, Tile[][] tiles){
		this.frame = frame;
		this.tiles = tiles;
		
		System.out.println("Made screen");
		
		thread.run();
	}
	
	public void paintComponent(Graphics g){
		System.out.println("Tries to draw");
		g.clearRect(0, 0, frame.getWidth(), frame.getHeight());
		
		for(int x = 0; x<tiles.length; x++){
			for(int y = 0; y<tiles[0].length; y++){
				//Gets the color of the tile and draws it
				g.setColor(tiles[x][y].getColor());
				g.drawRect(tiles[x][y].p.x, tiles[x][y].p.y,
						tiles[x][y].length.x, tiles[x][y].length.y);
				//Checks for a picture in the tile if true, draw image
				if(tiles[x][y].hasPicture())g.drawImage(tiles[x][y].getTexture(), 
						tiles[x][y].p.x, tiles[x][y].p.y, null);
			}
		}
		
		System.out.println("drawed");
		
	}
	
	public void run() {
		
		System.out.println("Thread is running");
		
		running = true;
		
		while(running){
			repaint();
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
