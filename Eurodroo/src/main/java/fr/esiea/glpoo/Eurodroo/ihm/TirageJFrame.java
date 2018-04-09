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
	private Dessin fenetre2;
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
		fenetre2 = new Dessin(0,0,0,0,0,0,0);
		fenetre2.setVisible(true);
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

	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int etoile1;
	private int etoile2;
	// public Object values;

	public class Dessiner extends AbstractAction {

		private Dessiner() {
			super("Dessiner");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			log.debug("Click sur le bouton ajouter");
			fenetre2.setVisible(false);
			fenetre2.dispose();

			final int[] rows = tab.getSelectedRows();
			for (int i = 0; i < rows.length; i++) {
				log.debug(rows[i]);
				boule1 = (int) tab.getValueAt(rows[i], 1);
				boule2 = (int) tab.getValueAt(rows[i], 2);
				boule3 = (int) tab.getValueAt(rows[i], 3);
				boule4 = (int) tab.getValueAt(rows[i], 4);
				boule5 = (int) tab.getValueAt(rows[i], 5);
				etoile1 = (int) tab.getValueAt(rows[i], 6);
				etoile2 = (int) tab.getValueAt(rows[i], 7);

				fenetre2 = new Dessin(boule1, boule2, boule3, boule4, boule5, etoile1, etoile2);
				fenetre2.setVisible(true);

			}
			// fenetre2.drawPanel();
		}
	}
}
