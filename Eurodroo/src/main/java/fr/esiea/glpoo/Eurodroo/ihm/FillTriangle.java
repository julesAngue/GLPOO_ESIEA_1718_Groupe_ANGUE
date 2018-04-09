package fr.esiea.glpoo.Eurodroo.ihm;

import javax.swing.JPanel;
import javax.swing.*;  

import java.awt.*;  

public class FillTriangle extends JPanel {
	
	public void paintComponent(Graphics g)  
	{  
	 super.paint(g);  
	  
	 //All triangle corner x coordinate  
	 int[]x={0,150,300};  
	  
	 //All triangle corner y coordinate  
	 int[]y={200,0,200};  
	  
	 //Set color base on RGB  
	 //You can get RGB value for your color at "Color picker" at above  
	 //R=255  
	 //G=192  
	 //B=0  
	 //So after this all you draw will use this color  
	 g.setColor(new Color(255,192,0));  
	  
	 //Draw triangle in JPanel  
	 g.fillPolygon(x,y,3);  
	  
	 //Set color base on RGB  
	 //You can get RGB value for your color at "Color picker" at above  
	 //R=1  
	 //G=1  
	 //B=1  
	 //So after this all you draw will use this color  
	 g.setColor(new Color(1,1,1));  
	  
	 //Set font that will use when draw String  
	 g.setFont(new Font("Arial",Font.BOLD,14));  
	  
	 //Draw String in JPanel  
	 g.drawString("(0,200)",10,200);  
	 g.drawString("(150,0)",150,20);  
	 g.drawString("(300,200)",290,200);  
	}  

}
