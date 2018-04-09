package fr.esiea.glpoo.Eurodroo.ihm;

import fr.esiea.glpoo.Eurodroo.ihm.TirageJFrame;

import org.apache.log4j.Logger;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import fr.esiea.glpoo.Eurodroo.ihm.*;

public class Dessin extends JFrame {

	private final static Logger log = Logger.getLogger(TirageJFrame.class);
	JFrame fenetre2 = new JFrame();
	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int etoile1;
	private int etoile2;
	private Oval jPanel;
	private FillOval jPanel2;
	private Rectangle jPanel3;
	private fillRectangle jPanel4;
	private Triangle jPanel5;
	private FillTriangle jPanel6;

	public Dessin(int boule1, int boule2, int boule3, int boule4, int boule5, int etoile1, int etoile2) {
		super();
		this.boule1 = boule1;
		this.boule2 = boule2;
		this.boule3 = boule3;
		this.boule4 = boule4;
		this.boule5 = boule5;
		this.etoile1 = etoile1;
		this.etoile2 = etoile2;

		setTitle("Dessins");
		setSize(400, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan = new JPanel();
		pan.setBackground(Color.WHITE);
		this.setContentPane(pan);
		this.setVisible(true);
		// this.setContentPane(new Forme());
		// this.setContentPane(new testdessin());

		/*
		 * switch(bouleXIndex) { case 0 : return getContentPane().add(jPanel); }
		 */

		this.jPanel = new Oval();
		this.jPanel2 = new FillOval();
		this.jPanel3 = new Rectangle();
		this.jPanel4 = new fillRectangle();
		this.jPanel5 = new Triangle();
		this.jPanel6 = new FillTriangle();

		// jPanel.setBackground(Color.GREEN);
		// jPanel2.setBackground(Color.YELLOW);

		getContentPane().setLayout(new GridLayout(1, 2));


		//getContentPane().add(jPanel);//ov
		getContentPane().add(jPanel2);//fillov
		//getContentPane().add(jPanel3);//rec
		//getContentPane().add(jPanel4);
		//getContentPane().add(jPanel5);//tri
		//getContentPane().add(jPanel6);

		setSize(640, 480);
		setVisible(true);

	}

	public void abscisse() {

	}

	public void ordonnée() {

	}

	public void hauteur() {

	}

	public void largeur() {

	}

	public void plein() {

	}

	public void rotation() {

	}

	public void couleur(Graphics g) {

	}

	public void forme() {

	}

	public JPanel etoileToForme(int boule) {
		JPanel panel = new JPanel();
		switch (boule) {
		case 1:
		case 2:
			panel = new Oval();
			break;
		case 3:
		case 4:
			panel = new FillOval();
			break;
		case 5:
		case 6:
			panel = new Rectangle();
			break;
		case 7:
		case 8:
			panel = new fillRectangle();
			break;
		case 9:
		case 10:
			panel = new Triangle();
			break;
		case 11:
		case 12:
			panel = new FillTriangle();
			break;
		}
		return panel;
	}
}
