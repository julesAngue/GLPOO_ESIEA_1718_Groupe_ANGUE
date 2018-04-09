package fr.esiea.glpoo.Eurodroo.ihm;

import static java.awt.BorderLayout.SOUTH;

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

import fr.esiea.glpoo.Eurodroo.ihm.TirageModel;

import org.apache.log4j.Logger;

public class TirageJFrame extends JFrame {

	private final static Logger log = Logger.getLogger(TirageJFrame.class);
	private final TirageModel modele = new TirageModel();
	final JTable tab = new JTable(modele);

	public TirageJFrame() {
		super();

		setTitle("Tirage");
		setPreferredSize(new Dimension(600, 400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		final JScrollPane scroll = new JScrollPane(tab);
		getContentPane().add(scroll, BorderLayout.CENTER);

		/*
		 * final JPanel barreBouton = new JPanel();
		 * barreBouton.setBackground(Color.GREEN); final JButton boutonDessin = new
		 * JButton("Dessiner"); barreBouton.add(boutonDessin);
		 * getContentPane().add(barreBouton, BorderLayout.SOUTH);
		 */

		final JPanel boutons = new JPanel();
		boutons.add(new JButton(new Dessiner()));
		getContentPane().add(boutons, SOUTH);

		pack();

	}

	/*
	 * public int[] getValues() { ======= >>>>>>> refs/remotes/origin/master
	 * 
	 * <<<<<<< HEAD final int[] values = tab.getSelectedRows(); for (int i = 0; i <=
	 * values.length; i++) { log.debug(values[i]); } return values; }
	 */
	/*
	 * public class boutonDessin extends AbstractAction{
	 * 
	 * public boutonDessin() { super("dessin"); }
	 * 
	 * public void actionPerformed(ActionEvent e) { log.debug("lancement dessin");
	 * final int[] values = tab.getSelectedRows(); for (int i = 0; i <=
	 * values.length; i++) { log.debug(values[i]); System.out.println("cc");
	 * 
	 * } } }
	 */

	public Object boule1;
	public Object values;

	public class Dessiner extends AbstractAction {

		private Dessiner() {
			super("Dessiner");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			log.debug("Click sur le bouton ajouter");
			final int[] rows = tab.getSelectedRows();
			for (int i = 0; i < rows.length; i++) {
				log.debug(rows[i]);
				boule1 = tab.getValueAt(rows[i], 1);
				//log.debug(boule1);
			
				for (int j = 0; j < modele.getColumnCount(); j++) {
				log.debug(tab.getValueAt(rows[i], j ));
					values = tab.getValueAt(rows[i], j);
					log.debug(values);
				}
			}
		}
	}
}
