package com.github.mathmods.boardgames.resource;

import java.awt.Color;

public class Main {

	public Tile[][] Tiles;
	
	
	public Main(int boardsizex, int boardsizey, int tilesx, int tilesy, Color[][] colors){
		
		Tiles = new Tile[tilesx][tilesy];
		createBoard(boardsizex, boardsizey, tilesx, tilesy);
		setColors(colors, tilesx, tilesy);
		
		startGame(boardsizex, boardsizey, tilesx, tilesy);
		
	}
	
	public void createBoard(int boardsizex, int boardsizey, int tilesx, int tilesy){
		for(int x = 0; x < tilesx; x++){
			for(int y = 0; y < tilesx; y++)Tiles[x][y] = new Tile((boardsizex/tilesx)*x, 
					(boardsizey/tilesy)*y, boardsizex/tilesx, boardsizey/tilesy);
		}
	}
	
	public void setColors(Color[][] colors, int tilesx, int tilesy){
		for(int x = 0; x < tilesx; x++){
			for(int y = 0; y < tilesx; y++)Tiles[x][y].setColor(colors[x][y]);
		}
	}
	
	public void startGame(final int boardsizex, final int boardsizey, 
			final int tilesx, final int tilesy){
		int[] i = new int[4];
		i[0] = boardsizex;
		i[1] = boardsizey;
		i[2] = tilesx;
		i[3] = tilesy;
		Frame.invoke(i, Tiles);
	}
	
	public Tile[][] getTiles(){
		return Tiles;
	}
}
