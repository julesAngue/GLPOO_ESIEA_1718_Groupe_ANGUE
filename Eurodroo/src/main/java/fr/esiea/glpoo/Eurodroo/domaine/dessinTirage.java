package fr.esiea.glpoo.Eurodroo.domaine;

import java.util.List;

public interface dessinTirage {

	public int getAbscisse();
	
	public int getOrdonnée();
	
	public int getTaille();
	
	public FormeDessin getForme();
	
	public List getCouleur();
	
	public int getRotation();

	
	
}
