package fr.esiea.glpoo.Eurodroo.ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Oval extends JPanel {
	
	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int etoile2;
	

	public Oval(int boule1, int boule2, int boule3, int boule4, int boule5, int etoile2) {
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
		  //g.setColor(new Color(255,192,0));
			int x = 20;
			int y = 20;
			int width = 75;
			int height = 75;
			
			g.setFont(new Font("Arial",Font.BOLD,14));  
			  
			 //Draw String in JPanel
			 //g.setColor(Color.BLACK);  
			 g.drawString("23",20,20); 
	   g.drawOval(x, y, width, height);
	   
	   g.setColor(c);
	}


	
	
}
