package fr.esiea.glpoo.Eurodroo.domaine;

import java.util.List;

public interface dessin {

	public double getAbscisse();
	
	public double getOrdonnée();
	
	public double getTaille();
	
	public FormeDessin getForme();
	
	public List getCouleur();
	
	public double getRotation();

	
	
}
