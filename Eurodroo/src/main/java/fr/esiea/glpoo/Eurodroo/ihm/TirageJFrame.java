package fr.esiea.glpoo.Eurodroo.ihm;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import fr.esiea.glpoo.Eurodroo.Launcher;

import fr.esiea.glpoo.Eurodroo.domaine.SimpleDessinTirage;

import org.apache.log4j.Logger;

public class TirageJFrame extends JFrame {
	
	private final static Logger log = Logger.getLogger(TirageJFrame.class);
	private final TirageModel modele = new TirageModel();
	final JTable tab = new JTable(modele);

	public TirageJFrame(){
		super();

		setTitle("Tirage");
		setPreferredSize(new Dimension(600, 400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		final JScrollPane scroll = new JScrollPane(tab);
		getContentPane().add(scroll, BorderLayout.CENTER);
		
		final JPanel barreBouton = new JPanel();
		barreBouton.setBackground(Color.GREEN);
		final JButton boutonAddDessin = new JButton("Ajouter");
		barreBouton.add(boutonAddDessin);
		final JButton boutonDeleteDessin = new JButton("Supprimer");
		barreBouton.add(boutonDeleteDessin);
		getContentPane().add(barreBouton, BorderLayout.SOUTH);
		pack();
	}

	private class AjouterAction extends AbstractAction {

		public AjouterAction() {
			super("Ajout Dessin");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			log.debug("ici actionPerformed");
			final SimpleDessinTirage dessin = new SimpleDessinTirage(33, 12,3,1,4,4,5,6,6);
			modele.addDessin(dessin);
		}
	}

	private class SupprimerAction extends AbstractAction {

		public SupprimerAction() {
			super("Supprimer Dessin");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			log.debug("ici actionPerformed");
			final int[] rows = tab.getSelectedRows();
			for (int i = rows.length - 1; 0 <= i; i--) {
				modele.delete(rows[i]);
			}
		}

	}
}
