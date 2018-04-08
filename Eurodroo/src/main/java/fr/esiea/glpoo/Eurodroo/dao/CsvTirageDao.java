package fr.esiea.glpoo.Eurodroo.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.esiea.glpoo.Eurodroo.domaine.dessinTirage;
import fr.esiea.glpoo.Eurodroo.domaine.SimpleDessinTirage;
import fr.esiea.glpoo.Eurodroo.domaine.FormeDessin;

public class CsvTirageDao implements TirageDao {
	
	private final String fileName;

	public CsvTirageDao(String fileName) {
		this.fileName = fileName;
	}

	public List<dessinTirage> Tirage() {
		final List<dessinTirage> dessins = new ArrayList<>();

		//boolean first = false;

		// fichier > ligne
		final List<String> lignes = lecture();
		// ligne > dessin
		for (final String ligne : lignes) {
			if (ligne.trim().isEmpty() || ligne.startsWith("#")) {
				continue;
			}
		/*	if (first) {
				first = false;
				continue;
			}*/
			final dessinTirage dessin = transform(ligne);
			dessins.add(dessin);
		}
		return dessins;
	}

	private dessinTirage transform(final String ligne) {
		final SimpleDessinTirage dessin = new SimpleDessinTirage();
		
		//remplir les champs a partir de la ligne

		  
		  final String separator = ";"; 
		  final String[] values = ligne.split(separator);
		  
		  dessin.setNbTirage(Integer.valueOf(values[0])); //Numero tirage
		  
		  dessin.setBoule1(Integer.valueOf(values[5])); //boule 1
		  
		  dessin.setBoule2(Integer.valueOf(values[6])); //boule 2
		  
		  dessin.setBoule3(Integer.valueOf(values[7])); //boule 3
		  
		  dessin.setBoule4(Integer.valueOf(values[8])); //boule 4
		  
		  dessin.setBoule5(Integer.valueOf(values[9])); //boule 5
		  
		  dessin.setEtoile1(Integer.valueOf(values[10])); //étoile 1
		  
		  dessin.setEtoile2(Integer.valueOf(values[11])); //étoile 2
		  
		 	
		 
		return dessin;
	}

	private List<String> lecture() {

		final Path path = Paths.get(fileName);

		try {
			final List<String> lines = Files.lines(path).collect(Collectors.toList());
			return lines;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	
	}


}
	
