package fr.esiea.glpoo.Eurodroo.ihm;


import static fr.esiea.glpoo.Eurodroo.domaine.FormeDessin.CARRE;

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

import fr.esiea.glpoo.Eurodroo.App;
import fr.esiea.glpoo.Eurodroo.domaine.FormeDessin;
import fr.esiea.glpoo.Eurodroo.domaine.SimpleDessin;

import org.apache.log4j.Logger;

public class DessinJFrame extends JFrame {
	
	private final static Logger log = Logger.getLogger(DessinJFrame.class);
	private final DessinModel modele = new DessinModel();
	final JTable tab = new JTable(modele);

	public DessinJFrame(){
		super();

		setTitle("Dessins");
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
			final SimpleDessin dessin = new SimpleDessin(33, 12.0,new String[] { "bleu" },44,44,CARRE);
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
