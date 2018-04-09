package fr.esiea.glpoo.Eurodroo.ihm;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Rectangle extends JPanel {

	public void paintComponent(Graphics g) {
		int x = 10;
		int y = 10;
		int width = 80;
		int height = 80;
		
		g.drawRect(x, y, width, height);
	
	}
}
