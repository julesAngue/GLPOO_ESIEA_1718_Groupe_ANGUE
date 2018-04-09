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
		
		final JPanel boutons = new JPanel();
        boutons.add(new JButton(new Dessiner()));
        getContentPane().add(boutons, SOUTH);
        
		pack();
	}


	private class Dessiner extends AbstractAction {

        private Dessiner() {
            super("Dessiner");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            log.debug("Click sur le bouton ajouter");
        }
    }
	
}
