package fr.esiea.glpoo.Eurodroo.ihm;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

public class fillRectangle extends JPanel{
	
	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int etoile2;

	public fillRectangle(int boule1, int boule2, int boule3, int boule4, int boule5, int etoile2) {
		this.boule1 = boule1;
		this.boule2 = boule2;
		this.boule3 = boule3;
		this.boule4 = boule4;
		this.boule5 = boule5;
		this.etoile2 = etoile2;
	}

	public void paint(Graphics g) {
		
		super.paint(g);
		
		Color c = g.getColor();
		
		g.setColor(Color.RED);
		
		int x = 10;
		int y = 10;
		int width = 80;
		int height = 80;
		
		g.fillRect(x,y,width,height);
		
		g.setFont(new Font("Arial",Font.BOLD,14));  
		  
		 //Draw String in JPanel
		 //g.setColor(Color.BLACK);  
		 g.drawString("23",20,20); 
	
		g.setColor(c);
	}

}
