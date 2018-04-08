package fr.esiea.glpoo.Eurodroo.ihm;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.apache.log4j.Logger;

import fr.esiea.glpoo.Eurodroo.dao.CsvDessinDao;
import fr.esiea.glpoo.Eurodroo.dao.DessinDao;
import fr.esiea.glpoo.Eurodroo.domaine.dessin;

public class DessinModel extends AbstractTableModel {

	private final static Logger Log = Logger.getLogger(DessinModel.class);
	
	final String[] entetes;
	
	private final List<dessin> dessins;
	
	public DessinModel() {
		entetes = new String[] {
				"boule","boule"
		};
		final String fileName = "ressources/tirage.csv";
		final DessinDao daoCsv = new CsvDessinDao(fileName);
		dessins = daoCsv.findAllDessin();
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
		
		final dessin dessin = dessins.get(rowIndex);
		//return data[rowIndex][columnIndex];
		switch(columnIndex) {
		case 0 :
			return dessin.getAbscisse();
		case 1 :
			return dessin.getOrdonnée();
		case 2 : 
			return dessin.getCouleur();
		case 3 :
			return dessin.getForme();
		case 4 :
			return dessin.getTaille();
		case 5 :
			return dessin.getRotation();
		default :
			throw new IllegalArgumentException("Case doesn't exists");
		}
		
	}
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return entetes[column];
	}
	public void addDessin(final dessin dessin) {
		
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
