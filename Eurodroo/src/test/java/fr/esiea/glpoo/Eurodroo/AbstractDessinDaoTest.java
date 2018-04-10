package fr.esiea.glpoo.Eurodroo;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.esiea.glpoo.Eurodroo.dao.CsvTirageDao;
import fr.esiea.glpoo.Eurodroo.dao.TirageDao;
import fr.esiea.glpoo.Eurodroo.domaine.dessinTirage;

public abstract class AbstractDessinDaoTest {

	protected TirageDao dao;

	@Test
	public void testFindAllTirage() {
		final int expectedNombreTirage = 151;
		dao = new CsvTirageDao("src/main/ressources/tirages.csv");
		final List<dessinTirage> Tirages = dao.Tirage();
		final int nb = Tirages.size();
		Assert.assertEquals(expectedNombreTirage, nb);
	}

}
