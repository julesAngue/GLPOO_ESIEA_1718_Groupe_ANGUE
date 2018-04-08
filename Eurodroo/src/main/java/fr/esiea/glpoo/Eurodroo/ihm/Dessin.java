package fr.esiea.glpoo.Eurodroo.ihm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

public class Dessin extends JFrame {
	
	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int boule6;
	private int etoile1;
	private int etoile2;
	
	JFrame fenetre2 = new JFrame();
	
	public Dessin() {
		super();
		
		setTitle("Dessins");
		setSize(400,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pan = new JPanel();
		pan.setBackground(Color.ORANGE);
		this.setContentPane(pan);
		this.setVisible(true);
		//this.setContentPane(new Forme());
		//this.setContentPane(new testdessin());
		JPanel jPanel=new Forme();
		JPanel jPanel2=new testdessin();
 
		jPanel.setBackground(Color.GREEN);
		jPanel2.setBackground(Color.YELLOW);
 
		getContentPane().setLayout(new GridLayout(1,2));
 
		getContentPane().add(jPanel);
		getContentPane().add(jPanel2);
 
		setSize(640,480);
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
}
