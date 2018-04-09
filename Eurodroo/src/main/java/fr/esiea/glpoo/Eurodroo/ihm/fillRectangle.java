package fr.esiea.glpoo.Eurodroo.ihm;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

public class fillRectangle extends JPanel{
	
	public void paint(Graphics g) {
		super.paint(g);
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillRect(10,10,80,80);
		//g.setColor(Color.BLUE);
		//g.fillOval(150,50,80,80);
		g.setColor(c);
	}

}
