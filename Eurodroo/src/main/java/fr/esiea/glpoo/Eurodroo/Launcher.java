package fr.esiea.glpoo.Eurodroo;
import org.apache.log4j.Logger;

import fr.esiea.glpoo.Eurodroo.dao.CsvTirageDao;
import fr.esiea.glpoo.Eurodroo.dao.TirageDao;
import fr.esiea.glpoo.Eurodroo.domaine.dessinTirage;
import fr.esiea.glpoo.Eurodroo.ihm.DessinJFrame;

public class Launcher 
{
	private final static Logger log = Logger.getLogger(Launcher.class);
    public static void main( String[] args )
    {
      
    	final DessinJFrame fenetre = new DessinJFrame();
		fenetre.setVisible(true);
    	
    }
}
