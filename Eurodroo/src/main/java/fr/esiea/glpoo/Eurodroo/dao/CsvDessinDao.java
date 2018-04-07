package fr.esiea.glpoo.Eurodroo.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.esiea.glpoo.Eurodroo.domaine.dessin;
import fr.esiea.glpoo.Eurodroo.domaine.SimpleDessin;
import fr.esiea.glpoo.Eurodroo.domaine.FormeDessin;

public class CsvDessinDao implements DessinDao {
	
	private final String fileName;

	public CsvDessinDao(String fileName) {
		this.fileName = fileName;
	}

	public List<dessin> findAllDessin() {
		final List<dessin> oiseaux = new ArrayList<>();
		boolean first = true;
		// fichier > ligne
		final List<String> lignes = lecture();
		// ligne > oiseau
		for (final String ligne : lignes) {
			if (ligne.trim().isEmpty() || ligne.startsWith("#")) {
				continue;
			}
			
			if (first) {
				first = false;
				continue;
			}
			final dessin oiseau = transform(ligne);
			oiseaux.add(oiseau);
		}
		return oiseaux;
	}

	private oiseau transform(final String ligne) {
		final SimpleDessin dessin = new SimpleDessin();
		
		//remplir les champs a partir de la ligne

		  
		  final String separator = ","; 
		  final String[] values = ligne.split(separator);
		  
		  oiseau.setAbscisse(Double.valueOf(values[0])); 
		  oiseau.setOrdonnée(Double.valueOf(values[1]));
		  
		  oiseau.setCouleurs(values[2].split("-"));
		  
		  oiseau.setTaille(Double.valueOf(values[3]));
		  
		  oiseau.setTaille(Double.valueOf(values[4]));
		  
		  
		  final Forme forme = 
				  Forme.valueOfByCode(values[5]); 
		  oiseau.setForme(forme);
		  
		 	
		 
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
	
