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
		final List<dessin> dessin = new ArrayList<>();
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
			final dessin dessin = transform(ligne);
			oiseaux.add(dessin);
		}
		return dessin;
	}

	private forme transform(final String ligne) {
		final SimpleDessin dessin = new SimpleDessin();
		
		//remplir les champs a partir de la ligne

		  
		  final String separator = ","; 
		  final String[] values = ligne.split(separator);
		  
		  dessin.setAbscisse(Double.valueOf(values[0])); 
		  dessin.setOrdonnée(Double.valueOf(values[1]));
		  
		  dessin.setCouleurs(values[2].split("-"));
		  
		  dessin.setTaille(Double.valueOf(values[3]));
		  
		  dessin.setTaille(Double.valueOf(values[4]));
		  
		  
		  final FormeDessin forme = 
				  FormeDessin.valueOfByCode(values[5]); 
		  dessin.setForme(forme);
		  
		 	
		 
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
	
