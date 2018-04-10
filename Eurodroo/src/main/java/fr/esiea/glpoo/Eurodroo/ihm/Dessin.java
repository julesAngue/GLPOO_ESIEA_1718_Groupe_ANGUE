package fr.esiea.glpoo.Eurodroo.ihm;

import fr.esiea.glpoo.Eurodroo.ihm.TirageJFrame;

import org.apache.log4j.Logger;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.log4j.Logger;

import fr.esiea.glpoo.Eurodroo.ihm.*;

public class Dessin extends JFrame {

	private final static Logger log = Logger.getLogger(TirageJFrame.class);
	JFrame fenetre2 = new JFrame();

	private List<JPanel> listFormes;

	public Dessin(List<JPanel> listFormes) {
		super();
		this.listFormes = listFormes;

		setTitle("Dessins");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan = new JPanel();
		pan.setBackground(Color.WHITE);
		this.setContentPane(pan);
		this.setVisible(true);

		getContentPane().setLayout(new GridLayout(14, 18));

		for (int i = 0; i < listFormes.size(); i++) {
			getContentPane().add(listFormes.get(i));
		}

		setSize(900, 880);
		setVisible(true);

	}

}
