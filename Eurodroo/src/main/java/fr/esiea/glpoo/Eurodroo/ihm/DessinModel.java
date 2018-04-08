package fr.esiea.glpoo.Eurodroo.ihm;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.apache.log4j.Logger;

import fr.esiea.glpoo.Eurodroo.Launcher;
import fr.esiea.glpoo.Eurodroo.dao.CsvTirageDao;
import fr.esiea.glpoo.Eurodroo.dao.TirageDao;
import fr.esiea.glpoo.Eurodroo.domaine.dessinTirage;

public class DessinModel extends AbstractTableModel {

	private final static Logger Log = Logger.getLogger(DessinModel.class);
	
	final String[] entetes;
	
	private final List<dessinTirage> dessins;
	
	public DessinModel() {
		entetes = new String[] {
				"boule","boule"
		};
		final String fileName = "ressources/tirage.csv";
		final TirageDao daoCsv = new CsvTirageDao(fileName);
		dessins = daoCsv.Tirage();
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		
		//return data.length;
		return entetes.length;
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return dessins.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
		final dessinTirage dessin = dessins.get(rowIndex);
		//return data[rowIndex][columnIndex];
		switch(columnIndex) {
		case 0 :
			return dessin.getBoule1();
		case 1 :
			return dessin.getBoule2();
		case 2 : 
			return dessin.getBoule3();
		case 3 :
			return dessin.getBoule4();
		case 4 :
			return dessin.getBoule5();
		case 5 :
			return dessin.getBoule6();
		default :
			throw new IllegalArgumentException("Case doesn't exists");
		}
		
	}
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return entetes[column];
	}
	public void addDessin(final dessinTirage dessin) {
		
		Log.debug("ajouterDessin");
		dessins.add(dessin);
		final int position = dessins.size() - 1;
		fireTableRowsInserted(position, position);
	}
	public void delete(final int position){
	Log.debug("supprimerDessin");
	dessins.remove(position);
	fireTableRowsDeleted(position, position);
}

	
	

}
