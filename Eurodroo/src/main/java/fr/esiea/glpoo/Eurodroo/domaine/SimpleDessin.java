package fr.esiea.glpoo.Eurodroo.domaine;

import java.util.ArrayList;
import java.util.List;

public class SimpleDessin implements dessin{
	
	private double abscisse;
	private double ordonnée;
	private String[] couleurs;
	private double taille;
	private double rotation;
	private FormeDessin forme;
	

	public SimpleDessin() {
		super();
	}

	public SimpleDessin(double abscisse, double ordonnée, String[] couleurs, double taille, double rotation, FormeDessin forme) {
		this();
		this.abscisse = abscisse;
		this.ordonnée = ordonnée;
		this.couleurs = couleurs;
		this.taille = taille;
		this.rotation = rotation;
		this.forme = forme;

	}
	

	public double getAbscisse() {
		return abscisse;
	}

	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}
	
	public double getOrdonnée() {
		return ordonnée;
	}

	public void setOrdonnée(double ordonnée) {
		this.ordonnée = ordonnée;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}

	public FormeDessin getForme() {
		return forme;
	}

	public void setForme(FormeDessin forme) {
		this.forme = forme;
	}

	public List getCouleurs() {
		List<String> couleurList = new ArrayList<String>();
		for (String couleur : couleurs) {
			couleurList.add(couleur);
		}
		return couleurList;
	}

	public void setCouleurs(String[] couleurs) {
		this.couleurs = couleurs;
	}

}
