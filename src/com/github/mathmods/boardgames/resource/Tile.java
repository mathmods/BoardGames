package com.github.mathmods.boardgames.resource;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

public class Tile {
	
	public Point p;
	public Point length;
	private Image texture = null;
	private Color color = Color.WHITE;
	
	public Tile(int posx, int posy, int lengthx, int lengthy){
		p = new Point(posx, posy);
		length = new Point(lengthx, lengthy);
	}
	
	public boolean isInTile(int posx, int posy){
		if(p.x < posx && p.y < posy && p.x+length.x > posx && p.y+length.y > posy){
			return true;
		}
		return false;
	}
	
	public boolean hasPicture(){
		return texture != null;
	}
	
	public void setTexture(Image i, boolean isResized){
		if(isResized){
			texture = i;
		}else{
			texture = i.getScaledInstance(length.x, length.y, Image.SCALE_SMOOTH);
		}
	}
	
	public void setTexure(String game, String name){
		texture = new ImageIcon("res/" + game + "/" + name + ".png").getImage()
				.getScaledInstance(length.x, length.y, Image.SCALE_SMOOTH);
	}
	
	public void setTexture(String location){
		texture = new ImageIcon(location).getImage()
				.getScaledInstance(length.x, length.y, Image.SCALE_SMOOTH);
	}
	
	public void setTextureToNull(){
		texture = null;
	}
	
	public void setColor(Color c){
		color = c;
	}
	
	public Image getTexture(){
		return texture;
	}
	
	public Color getColor(){
		return color;
	}
}
