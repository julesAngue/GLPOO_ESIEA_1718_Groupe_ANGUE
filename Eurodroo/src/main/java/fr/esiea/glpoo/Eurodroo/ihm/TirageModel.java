package fr.esiea.glpoo.Eurodroo.ihm;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.apache.log4j.Logger;

import fr.esiea.glpoo.Eurodroo.Launcher;
import fr.esiea.glpoo.Eurodroo.dao.CsvTirageDao;
import fr.esiea.glpoo.Eurodroo.dao.TirageDao;
import fr.esiea.glpoo.Eurodroo.domaine.dessinTirage;

public class TirageModel extends AbstractTableModel {

	private final static Logger Log = Logger.getLogger(TirageModel.class);
	
	final String[] entetes;
	
	private final List<dessinTirage> dessins;
	
	public TirageModel() {
		
		entetes = new String[] {"nbtirage","boule1","boule2","boule3","boule4","boule5","etoile1","etoile2"};
		final String fileName = "src/main/ressources/tirages.csv";


		final TirageDao daoCsv = new CsvTirageDao(fileName);
		dessins = daoCsv.Tirage();
	}
	
	@Override
	public int getColumnCount() {
	
		
	
		return entetes.length;
	}
	
	@Override
	public int getRowCount() {
		
		return dessins.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		
		final dessinTirage dessin = dessins.get(rowIndex);
		
		switch(columnIndex) {
		case 0 :
			return dessin.getNbTirage();
		case 1 :
			return dessin.getBoule1();
		case 2 :
			return dessin.getBoule2();
		case 3 : 
			return dessin.getBoule3();
		case 4 :
			return dessin.getBoule4();
		case 5 :
			return dessin.getBoule5();
		case 6 :
			return dessin.getEtoile1();
		case 7 :
			return dessin.getEtoile2();
		default :
			throw new IllegalArgumentException("Case doesn't exists");
		}
		
	}
	@Override
	public String getColumnName(int column) {
		
		return entetes[column];
	}
	
	public void values(final dessinTirage dessins) {
		
		Log.debug("ajouterDessin");
		
	}


	
	

}
