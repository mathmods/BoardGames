package com.github.mathmods.boardgames.chess;

import java.awt.Color;

import com.github.mathmods.boardgames.resource.Main;
import com.github.mathmods.boardgames.resource.Tile;

public class Chess extends Main {

	Tile[][] t;
	
	public Chess() {
		super(50*8, 50*8, 8, 8, Colors());
		System.out.println("Made main");
		t = getTiles();
		System.out.println("Got tiles");
	}
	
	private static Color[][] Colors(){
		boolean black = true;
		int tilesx = 0;
		int tilesy = 0;
		
		Color[][] colors = new Color[8][8];
		
		while(tilesx < 8){
			colors[tilesx][tilesy] = black ? Color.BLACK : Color.WHITE;
			tilesy++;
			if(tilesy == 8){
				tilesy = 0;
				tilesx++;
			}
			black = black ? false : true;
		}
		
		System.out.println("Got colors");
		return colors;
	}
	
	public static void main(String[] args){
		System.out.println("Started");
		new Chess();
	}
	
}
