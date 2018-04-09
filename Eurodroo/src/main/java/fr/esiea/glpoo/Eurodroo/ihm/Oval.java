package fr.esiea.glpoo.Eurodroo.ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Oval extends JPanel {

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
