package fr.esiea.glpoo.Eurodroo;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.esiea.glpoo.Eurodroo.dao.CsvTirageDao;
import fr.esiea.glpoo.Eurodroo.dao.TirageDao;
import fr.esiea.glpoo.Eurodroo.domaine.dessinTirage;

public class TirageValuesTest extends AbstractDessinDaoTest {
	private TirageDao dao;

	@Before
	public void doBefore() {
		final String file = new String("src/main/ressources/tirages.csv");
		dao = new CsvTirageDao(file);
	}

	@Test
	public void testFindAllOiseauNombreItems() {
		// Arrange
		final int expectedNbTirage = 151;
		// Act
		final List<dessinTirage> Tirages = dao.Tirage();
		final int nb = Tirages.size();

		// Assert
		Assert.assertEquals(expectedNbTirage, nb);
	}

	@Test
	public void testValuesAnneeTirage() {
		// Arrange
		final int[] expectedAnneeTirage = {2016078, 2016079, 2016080, 2016081, 2016082, 2016083, 2016084, 2016085,
				2016086, 2016087, 2016088, 2016089, 2016090, 2016091, 2016092, 2016093, 2016094, 2016095, 2016096,
				2016097, 2016098, 2016099, 2016100, 2016101, 2016102, 2016103, 2016104, 2016105, 2017001, 2017002,
				2017003, 2017004, 2017005, 2017006, 2017007, 2017008, 2017009, 2017010, 2017011, 2017012, 2017013,
				2017014, 2017015, 2017016, 2017017, 2017018, 2017019, 2017020, 2017021, 2017022, 2017023, 2017024,
				2017025, 2017026, 2017027, 2017028, 2017029, 2017030, 2017031, 2017032, 2017033, 2017034, 2017035,
				2017036, 2017037, 2017038, 2017039, 2017040, 2017041, 2017042, 2017043, 2017044, 2017045, 2017046,
				2017047, 2017048, 2017049, 2017050, 2017051, 2017052, 2017053, 2017054, 2017055, 2017056, 2017057,
				2017058, 2017059, 2017060, 2017061, 2017062, 2017063, 2017064, 2017065, 2017066, 2017067, 2017068,
				2017069, 2017070, 2017071, 2017072, 2017073, 2017074, 2017075, 2017076, 2017077, 2017078, 2017079,
				2017080, 2017081, 2017082, 2017083, 2017084, 2017085, 2017086, 2017087, 2017088, 2017089, 2017090,
				2017091, 2017092, 2017093, 2017094, 2017095, 2017096, 2017097, 2017098, 2017099, 2017100, 2017101,
				2017102, 2017103, 2017104, 2018001, 2018002, 2018003, 2018004, 2018005, 2018006, 2018007, 2018008,
				2018009, 2018010, 2018011, 2018012, 2018013, 2018014, 2018015, 2018016, 2018017, 2018018, 2018019};
		// Act
		final List<dessinTirage> Tirages = dao.Tirage();
		for (int i = 0; i < Tirages.size(); i++) {
			final dessinTirage tirage = Tirages.get(i);
			final int NbTirage = tirage.getNbTirage();
			// Assert
			Assert.assertEquals(expectedAnneeTirage[i], NbTirage);
		}

	}

	@Test
	public void testValuesBoules1() {
		// Arrange
		final int[] expectedBoule1 = { 41, 35, 4, 12, 12, 31, 2, 48, 28, 23, 10, 7, 49, 38, 42, 32, 47, 28, 38, 23, 27,
				6, 28, 45, 15, 46, 32, 10, 34, 21, 44, 16, 43, 17, 5, 28, 4, 3, 44, 43, 44, 25, 19, 13, 35, 47, 6, 38,
				21, 19, 47, 2, 33, 24, 24, 35, 22, 33, 22, 2, 11, 20, 27, 7, 26, 2, 20, 30, 15, 36, 27, 8, 25, 9, 12,
				38, 44, 4, 45, 35, 22, 45, 50, 21, 41, 8, 14, 41, 29, 29, 26, 39, 14, 39, 10, 15, 4, 8, 28, 42, 35, 44,
				45, 6, 40, 18, 32, 15, 36, 23, 19, 4, 27, 39, 46, 41, 37, 37, 16, 35, 31, 28, 42, 5, 48, 34, 39, 25, 15,
				5, 30, 4, 20, 41, 6, 45, 46, 44, 5, 28, 11, 36, 8, 38, 13, 23, 6, 18, 48, 2, 26 };
		// Act
		final List<dessinTirage> Tirages = dao.Tirage();
		for (int i = 0; i < Tirages.size(); i++) {
			final dessinTirage tirage = Tirages.get(i);
			final int Boule1 = tirage.getBoule1();
			// Assert
			Assert.assertEquals(expectedBoule1[i], Boule1);
		}

	}

	@Test
	public void testValuesBoules2() {
		// Arrange
		final int[] expectedBoule2 = { 6, 44, 38, 30, 37, 34, 25, 9, 15, 43, 20, 11, 47, 49, 7, 27, 10, 23, 27, 32, 1,
				40, 50, 10, 27, 39, 22, 22, 27, 14, 29, 7, 4, 10, 1, 45, 17, 4, 38, 26, 40, 19, 41, 2, 31, 2, 37, 49, 5,
				29, 23, 21, 13, 26, 33, 10, 5, 20, 17, 13, 9, 25, 25, 43, 22, 28, 8, 12, 8, 5, 48, 42, 40, 39, 3, 42,
				43, 31, 17, 50, 25, 37, 26, 14, 27, 1, 44, 9, 24, 30, 15, 48, 30, 42, 12, 7, 12, 7, 18, 47, 17, 49, 21,
				31, 29, 32, 6, 1, 4, 37, 26, 27, 9, 23, 12, 5, 19, 36, 40, 36, 28, 24, 1, 46, 11, 32, 20, 42, 38, 30, 4,
				48, 10, 38, 49, 30, 34, 3, 23, 15, 15, 39, 28, 22, 44, 32, 25, 17, 31, 7, 44 };
		// Act
		final List<dessinTirage> Tirages = dao.Tirage();
		for (int i = 0; i < Tirages.size(); i++) {
			final dessinTirage tirage = Tirages.get(i);
			final int Boule2 = tirage.getBoule2();
			// Assert
			Assert.assertEquals(expectedBoule2[i], Boule2);
		}

	}

	@Test
	public void testValuesBoules3() {
		// Arrange
		final int[] expectedBoule3 = { 13, 17, 7, 27, 20, 19, 17, 23, 21, 10, 6, 12, 9, 3, 15, 12, 5, 5, 21, 6, 7, 37,
				48, 6, 13, 16, 39, 29, 49, 49, 35, 50, 25, 27, 23, 20, 44, 50, 4, 7, 24, 33, 49, 43, 10, 11, 50, 31, 44,
				36, 20, 17, 46, 45, 9, 2, 31, 4, 45, 22, 32, 30, 19, 30, 16, 29, 30, 9, 42, 39, 38, 33, 20, 27, 22, 15,
				11, 21, 21, 39, 10, 20, 42, 20, 1, 26, 43, 31, 21, 41, 40, 28, 46, 24, 17, 1, 32, 3, 29, 24, 29, 13, 1,
				39, 1, 7, 50, 9, 37, 50, 17, 23, 33, 16, 43, 33, 41, 29, 39, 26, 10, 50, 12, 29, 44, 22, 37, 30, 46, 24,
				17, 8, 21, 20, 38, 21, 31, 17, 8, 24, 35, 34, 17, 31, 10, 50, 14, 28, 3, 34, 20 };
		// Act
		final List<dessinTirage> Tirages = dao.Tirage();
		for (int i = 0; i < Tirages.size(); i++) {
			final dessinTirage tirage = Tirages.get(i);
			final int Boule3 = tirage.getBoule3();
			// Assert
			Assert.assertEquals(expectedBoule3[i], Boule3);
		}

	}

	@Test
	public void testValuesBoules4() {
		// Arrange
		final int[] expectedBoule4 = { 39, 37, 14, 20, 24, 7, 21, 20, 3, 19, 37, 48, 50, 22, 36, 47, 33, 11, 28, 11, 11,
				28, 29, 30, 21, 20, 25, 47, 23, 10, 11, 3, 16, 49, 17, 17, 23, 46, 31, 35, 2, 36, 13, 22, 42, 29, 41,
				47, 36, 6, 44, 27, 9, 17, 1, 50, 49, 14, 38, 49, 19, 39, 6, 3, 12, 44, 11, 19, 25, 7, 12, 24, 22, 20,
				27, 17, 18, 3, 9, 17, 37, 35, 22, 47, 45, 49, 48, 5, 30, 40, 25, 46, 10, 45, 3, 47, 15, 14, 6, 49, 10,
				18, 8, 42, 48, 48, 24, 25, 21, 29, 13, 30, 13, 32, 36, 17, 20, 22, 41, 42, 2, 19, 6, 35, 43, 30, 50, 50,
				8, 31, 44, 22, 48, 5, 12, 13, 20, 50, 9, 48, 27, 14, 38, 44, 21, 12, 19, 47, 41, 48, 31 };
		// Act
		final List<dessinTirage> Tirages = dao.Tirage();
		for (int i = 0; i < Tirages.size(); i++) {
			final dessinTirage tirage = Tirages.get(i);
			final int Boule4 = tirage.getBoule4();
			// Assert
			Assert.assertEquals(expectedBoule4[i], Boule4);
		}

	}

	@Test
	public void testValuesBoules5() {
		// Arrange
		final int[] expectedBoule5 = { 9, 43, 34, 2, 5, 13, 27, 44, 20, 16, 29, 44, 5, 23, 48, 3, 34, 17, 26, 31, 45,
				12, 14, 41, 17, 4, 3, 8, 19, 18, 2, 26, 47, 31, 7, 48, 3, 15, 10, 21, 10, 48, 45, 4, 20, 30, 48, 36, 3,
				10, 1, 34, 31, 28, 34, 19, 21, 23, 31, 16, 43, 14, 23, 35, 8, 20, 15, 11, 27, 26, 7, 10, 37, 43, 49, 41,
				26, 38, 28, 47, 49, 11, 14, 11, 25, 9, 12, 29, 14, 36, 41, 18, 35, 2, 27, 5, 38, 49, 9, 9, 27, 37, 30,
				11, 41, 19, 48, 19, 34, 45, 36, 17, 11, 3, 1, 12, 7, 13, 14, 20, 14, 30, 18, 24, 36, 4, 44, 31, 30, 43,
				43, 23, 28, 2, 15, 23, 23, 8, 24, 6, 21, 48, 34, 36, 17, 10, 29, 10, 50, 45, 15 };
		// Act
		final List<dessinTirage> Tirages = dao.Tirage();
		for (int i = 0; i < Tirages.size(); i++) {
			final dessinTirage tirage = Tirages.get(i);
			final int Boule5 = tirage.getBoule5();
			// Assert
			Assert.assertEquals(expectedBoule5[i], Boule5);
		}

	}

	@Test
	public void testValuesEtoile1() {
		// Arrange
		final int[] expectedEtoile1 = { 2, 10, 4, 11, 4, 11, 9, 10, 5, 8, 9, 7, 9, 9, 3, 8, 10, 10, 11, 2, 9, 1, 8, 11,
				3, 5, 7, 1, 11, 9, 4, 4, 10, 3, 3, 9, 6, 9, 10, 9, 3, 2, 4, 8, 2, 12, 5, 8, 3, 9, 11, 5, 6, 4, 2, 7, 8,
				6, 12, 4, 3, 8, 12, 1, 7, 3, 3, 9, 1, 2, 9, 9, 7, 11, 11, 9, 8, 3, 1, 6, 8, 3, 8, 10, 7, 9, 11, 4, 10,
				9, 4, 12, 4, 2, 3, 9, 1, 5, 9, 1, 4, 9, 3, 3, 12, 3, 1, 1, 6, 5, 2, 3, 10, 1, 3, 4, 12, 1, 8, 5, 7, 10,
				2, 11, 2, 4, 4, 11, 4, 3, 10, 1, 1, 4, 9, 6, 3, 2, 7, 9, 5, 2, 6, 11, 10, 10, 11, 3, 11, 1, 2 };
		// Act
		final List<dessinTirage> Tirages = dao.Tirage();
		for (int i = 0; i < Tirages.size(); i++) {
			final dessinTirage tirage = Tirages.get(i);
			final int Etoile1 = tirage.getEtoile1();
			// Assert
			Assert.assertEquals(expectedEtoile1[i], Etoile1);
		}

	}

	@Test
	public void testValuesEtoile2() {
		// Arrange
		final int[] expectedEtoile2 = { 12, 2, 11, 9, 11, 1, 6, 8, 1, 2, 1, 3, 8, 2, 7, 6, 2, 11, 9, 12, 4, 5, 2, 4, 2,
				2, 12, 3, 1, 11, 9, 7, 2, 5, 8, 5, 9, 5, 8, 2, 10, 9, 3, 9, 12, 1, 4, 11, 6, 3, 4, 9, 10, 12, 6, 6, 2,
				10, 5, 5, 9, 2, 11, 3, 6, 9, 8, 4, 4, 10, 6, 3, 3, 10, 4, 12, 10, 7, 3, 8, 5, 6, 10, 7, 5, 5, 2, 2, 8,
				2, 5, 5, 10, 8, 5, 12, 5, 8, 1, 5, 11, 12, 2, 1, 6, 7, 5, 7, 3, 11, 3, 8, 7, 4, 5, 9, 2, 9, 10, 12, 5,
				3, 7, 12, 7, 3, 8, 2, 7, 6, 2, 12, 8, 8, 2, 4, 12, 7, 8, 4, 4, 3, 12, 1, 1, 4, 5, 7, 8, 12, 9 };
		// Act
		final List<dessinTirage> Tirages = dao.Tirage();
		for (int i = 0; i < Tirages.size(); i++) {
			final dessinTirage tirage = Tirages.get(i);
			final int Etoile2 = tirage.getEtoile2();
			// Assert
			Assert.assertEquals(expectedEtoile2[i], Etoile2);
		}

	}
}
