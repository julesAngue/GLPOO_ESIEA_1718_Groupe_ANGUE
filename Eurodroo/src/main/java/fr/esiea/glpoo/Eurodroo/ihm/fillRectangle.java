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
		
		 
		  
		  if( etoile2%3 == 0 ) {
			g.setColor(Color.RED);
		  }
		  if(etoile2%3 == 1){
			g.setColor(Color.GREEN);}
			
		  if (etoile2%3 == 2){
				g.setColor(Color.BLUE);}
			
		
			
		 
			int x = (boule1 * (100+boule1)) % (640 - boule3);
			int y = (boule2 * (100+boule2)) % (480 - boule4);
			
			int width = (boule1 * (100+boule1)) % (320 - boule3);
			int height = (boule2 * (100+boule2)) % (240 - boule4);
		
			
			g.setFont(new Font("Arial",Font.BOLD,14));  
			  
			 //Draw String in JPanel
			 
			String boule = String.valueOf(boule5);
		
			 g.drawString(boule, x , y); 
			 g.fillRect(x,y,width,height);
	   
	   g.setColor(c);
		
		
		
		
	}

}
