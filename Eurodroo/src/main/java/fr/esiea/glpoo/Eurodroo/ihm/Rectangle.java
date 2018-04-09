package fr.esiea.glpoo.Eurodroo.ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Rectangle extends JPanel {

	public void paint(Graphics g) {
		
super.paint(g);
		
		Color c = g.getColor();
		
		g.setColor(Color.RED);
		
		int x = 10;
		int y = 10;
		int width = 80;
		int height = 80;
		
		g.drawRect(x, y, width, height);
		
		g.setFont(new Font("Arial",Font.BOLD,14));  
		  
		 //Draw String in JPanel
		 //g.setColor(Color.BLACK);  
		 g.drawString("23",20,20); 
		 g.setColor(c);
	
	}
}
