package fr.esiea.glpoo.Eurodroo.ihm;

import static java.awt.BorderLayout.SOUTH;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JDialog;
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
	private List<JPanel> listFormes;
	final JTable tab = new JTable(modele);

	public TirageJFrame() {
		super();

		setTitle("Tirage");
		setPreferredSize(new Dimension(600, 400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		final JScrollPane scroll = new JScrollPane(tab);
		getContentPane().add(scroll, BorderLayout.CENTER);

		final JPanel boutons = new JPanel();
		boutons.add(new JButton(new Dessiner()));
		getContentPane().add(boutons, SOUTH);
		

		pack();
		this.listFormes = new ArrayList<JPanel>();
		listFormes.add(new JPanel());
		fenetre2 = new Dessin(listFormes);
		fenetre2.setVisible(true);
	}

	private int boule1;
	private int boule2;
	private int boule3;
	private int boule4;
	private int boule5;
	private int etoile1;
	private int etoile2;

	public class Dessiner extends AbstractAction {

		private Dessiner() {
			super("Selectionnez des lignes et cliquez pour dessiner");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			log.debug("Clic sur le bouton ");
			fenetre2.setVisible(false);
			fenetre2.dispose();
			listFormes.clear();

			final int[] rows = tab.getSelectedRows();

			for (int i = 0; i < rows.length; i++) {
				boule1 = (int) tab.getValueAt(rows[i], 1);
				boule2 = (int) tab.getValueAt(rows[i], 2);
				boule3 = (int) tab.getValueAt(rows[i], 3);
				boule4 = (int) tab.getValueAt(rows[i], 4);
				boule5 = (int) tab.getValueAt(rows[i], 5);
				etoile1 = (int) tab.getValueAt(rows[i], 6);
				etoile2 = (int) tab.getValueAt(rows[i], 7);
				ajoutFormes(etoile1, boule1, boule2, boule3, boule4, boule5, etoile2);
				log.debug(rows[i]);
			}
			fenetre2 = new Dessin(listFormes);
			fenetre2.setVisible(true);
		}

		public JPanel etoileToForme(int etoile1, int boule1, int boule2, int boule3, int boule4, int boule5,
				int etoile2) {
			JPanel panel = new JPanel();
			log.debug("dans etoileToformes");
			switch (etoile1) {
			case 1:
			case 2:
				panel = new Oval(boule1, boule2, boule3, boule4, boule5, etoile2);
				break;
			case 3:
			case 4:
				panel = new FillOval(boule1, boule2, boule3, boule4, boule5, etoile2);
				break;
			case 5:
			case 6:
				panel = new Rectangle(boule1, boule2, boule3, boule4, boule5, etoile2);
				break;
			case 7:
			case 8:
				panel = new fillRectangle(boule1, boule2, boule3, boule4, boule5, etoile2);
				break;
			case 9:
			case 10:
				panel = new Triangle(boule1, boule2, boule3, boule4, boule5, etoile2);
				break;
			case 11:
			case 12:
				panel = new FillTriangle(boule1, boule2, boule3, boule4, boule5, etoile2);
				break;
			}
			return panel;
		}

		public void ajoutFormes(int etoile1, int boule1, int boule2, int boule3, int boule4, int boule5, int etoile2) {
			log.debug("dans ajout formes");
			listFormes.add(etoileToForme(etoile1, boule1, boule2, boule3, boule4, boule5, etoile2));
		}
	}
}
