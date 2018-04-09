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
	private Object boule1;
	private Object boule2;
	private Object boule3;
	private Object boule4;
	private Object boule5;
	private Object etoile1;
	private Object etoile2;
	private Oval jPanel;
	private FillOval jPanel2;
	private Rectangle jPanel3;
	private fillRectangle jPanel4;
	private Triangle jPanel5;
	private FillTriangle jPanel6;
	
	
	public Dessin() {
		super();

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

		//getContentPane().add(jPanel);
		//getContentPane().add(jPanel2);
		getContentPane().add(jPanel4);

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

	public void setBoule1(Object boule1) {
		this.boule1 = boule1;
	}

	public void setBoule2(Object boule2) {
		this.boule2 = boule2;
	}

	public void setBoule3(Object boule3) {
		this.boule3 = boule3;
	}

	public void setBoule4(Object boule4) {
		this.boule4 = boule4;
	}

	public void setBoule5(Object boule5) {
		this.boule5 = boule5;
	}

	public void setEtoile1(Object etoile1) {
		this.etoile1 = etoile1;
	}

	public void setEtoile2(Object etoile2) {
		this.etoile2 = etoile2;
	}
	/*public void drawPanel() {
		// fonction pour changer les formes
		getContentPane().remove(jPanel2);
		this.jPanel2 = new FillOval();
		getContentPane().add(jPanel);
		log.debug( boule1);
		
	}*/
	

}
