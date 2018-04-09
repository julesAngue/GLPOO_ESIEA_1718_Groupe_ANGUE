package fr.esiea.glpoo.Eurodroo.ihm;

import javax.swing.JPanel;
import javax.swing.*;  

import java.awt.*;  

public class FillTriangle extends JPanel {
	
	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int etoile2;

	public FillTriangle(int boule1, int boule2, int boule3, int boule4, int boule5, int etoile2) {
		this.boule1 = boule1;
		this.boule2 = boule2;
		this.boule3 = boule3;
		this.boule4 = boule4;
		this.boule5 = boule5;
		this.etoile2 = etoile2;
	}

	public void paint(Graphics g)  
	{  
	 super.paint(g);  
	 
	 Color c = g.getColor();
		
	  if( etoile2%3 == 0 ) {
			g.setColor(Color.RED);
		  }
		  if(etoile2%3 == 1){
			g.setColor(Color.GREEN);}
			
		  if (etoile2%3 == 2){
				g.setColor(Color.BLUE);}

	  
	 //All triangle corner x coordinate  
		  int[]x={(boule1 * (0+boule1)) % (640 - boule3),(boule1 * (150+boule1)) % (640 - boule3),(boule1 * (300+boule1)) % (640 - boule3)};   
	  
	 //All triangle corner y coordinate  
		  int[]y={(boule2 * (0+boule2)) % (640 - boule4),(boule2 * (150+boule2)) % (640 - boule4),(boule2 * (300+boule2)) % (640 - boule4)};  
		  
	  
	
	  
	 //Draw triangle in JPanel  
	 g.fillPolygon(x,y,3);  
	  
	  
	 String boule = String.valueOf(boule5);
	  
	 //Set font that will use when draw String  
	 g.setFont(new Font("Arial",Font.BOLD,14));  
	  
	 //Draw String in JPanel  
	 g.drawString(boule,(boule1 * (0+boule1)) % (640 - boule3),(boule2 * (0+boule2)) % (640 - boule4));  

	 g.setColor(c);
	}  

}
