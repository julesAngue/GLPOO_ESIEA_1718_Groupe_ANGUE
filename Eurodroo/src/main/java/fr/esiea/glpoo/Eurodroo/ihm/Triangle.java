package fr.esiea.glpoo.Eurodroo.ihm;

import javax.swing.JPanel;
import javax.swing.*;  

import java.awt.*;  

public class Triangle extends JPanel {
	
	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int etoile2;

	public Triangle(int boule1, int boule2, int boule3, int boule4, int boule5, int etoile2) {
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
		
		g.setColor(Color.RED);

	  
	 //All triangle corner x coordinate  
	 int[]x={0,150,300};  
	  
	 //All triangle corner y coordinate  
	 int[]y={200,0,200};  
	  
	 
	 g.setColor(new Color(255,192,0));  
	  
	 //Draw triangle in JPanel  
	 g.drawPolygon(x,y,3);  
	  
	 
	g.setColor(new Color(1,1,1));  
	  
	 //Set font that will use when draw String  
	 g.setFont(new Font("Arial",Font.BOLD,14));  
	  
	 //Draw String in JPanel  
	 g.drawString("(0,200)",10,200);  
	 g.drawString("(150,0)",150,20);  
	 g.drawString("(300,200)",290,200);  
	 
	 g.setColor(c);
	}  

}
