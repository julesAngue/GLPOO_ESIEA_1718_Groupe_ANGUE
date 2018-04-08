package fr.esiea.glpoo.Eurodroo.domaine;

import java.util.ArrayList;
import java.util.List;

public class SimpleDessinTirage implements dessinTirage{
	
	private int abscisse;
	private int ordonnée;
	private String[] couleurs;
	private int taille;
	private int rotation;
	private FormeDessin forme;
	

	public SimpleDessinTirage() {
		super();
	}

	public SimpleDessinTirage(int abscisse, int ordonnée, String[] couleurs, int taille, int rotation, FormeDessin forme) {
		this();
		this.abscisse = abscisse;
		this.ordonnée = ordonnée;
		this.couleurs = couleurs;
		this.taille = taille;
		this.rotation = rotation;
		this.forme = forme;

	}
	

	public int getAbscisse() {
		return abscisse;
	}

	public void setAbscisse(int abscisse) {
		this.abscisse = abscisse;
	}
	
	public int getOrdonnée() {
		return ordonnée;
	}

	public void setOrdonnée(int ordonnée) {
		this.ordonnée = ordonnée;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getRotation() {
		return rotation;
	}

	public void setRotation(int rotation) {
		this.rotation = rotation;
	}

	public FormeDessin getForme() {
		return forme;
	}

	public void setForme(FormeDessin forme) {
		this.forme = forme;
	}


	public void setCouleurs(String[] couleurs) {
		this.couleurs = couleurs;
	}

	public List getCouleur() {
		List<String> couleurList = new ArrayList<String>();
		for (String couleur : couleurs) {
			couleurList.add(couleur);
		}
		return couleurList;
	}



}
