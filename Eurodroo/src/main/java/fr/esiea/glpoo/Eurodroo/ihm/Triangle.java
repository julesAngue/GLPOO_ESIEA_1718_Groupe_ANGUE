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

	public void paint(Graphics g) {
		super.paint(g);

		
		Color c = g.getColor();
		
		setBackground(Color.WHITE);

		if (etoile2 % 3 == 0) {
			g.setColor(Color.RED);
		}
		if (etoile2 % 3 == 1) {
			g.setColor(Color.GREEN);
		}


		// All triangle corner x coordinate
		int[] x = { boule1, boule2, boule3 };

		// All triangle corner y coordinate
		int[] y = { boule2, boule1, boule4 };

		// Draw triangle in JPanel
		g.fillPolygon(x, y, 3);

		String boule = String.valueOf(boule5);

		// Set font that will use when draw String
		g.setFont(new Font("Arial", Font.BOLD, 14));

		// Draw String in JPanel
		g.drawString(boule, boule1, boule2 );

		g.setColor(c);

	}

}
