package fr.esiea.glpoo.Eurodroo;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import fr.esiea.glpoo.Eurodroo.dao.CsvTirageDao;

public class CsvDessinDaoTest extends AbstractDessinDaoTest {

	private final static File FileName = new File("src/main/ressources/tirages.csv");
	
	@Before
	public void doBefore() {
		final String file = new String("src/main/ressources/tirages.csv");
		dao = new CsvTirageDao(file);
	}

	@Test
	public void testFileExist() {
		final File file = FileName;
		assertTrue(file.exists());
	}
}
