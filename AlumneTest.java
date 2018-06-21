package alumne;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AlumneTest {
	
	Alumne pep, joan, marta;
	
	@Before
	public void setUp() throws Exception {
		pep = new Alumne("Pep", 19, 2018, 6, 8);
		joan = new Alumne("Joan", 18, 2017, 5, 7);
		marta = new Alumne("Marta", 17, 2016, 4, 6);
	}

	@Test
	public void testEsMajorEdat() {
		assertTrue("Tindirà de ser major de edat.", pep.esMajorEdat());
		assertFalse("No tindirà de ser major de edat.", joan.esMajorEdat());
		assertFalse("No tindirà de ser major de edat.", marta.esMajorEdat());
	}

	@Test
	public void testAprovaM5() {
		assertTrue("Tindirà de estar aprovat.", pep.aprovaM5(80));
		assertTrue("Tindirà de estar aprovat.", joan.aprovaM5(80));
		assertFalse("No tindirà de estar aprovada.", marta.aprovaM5(80));
		
		assertFalse("No tindirà de estar aprovat.", pep.aprovaM5(79));
		assertFalse("No tindirà de estar aprovada.", marta.aprovaM5(79));
	}

	@Test
	public void testAnysMatriculat() {
		assertEquals("Tindrià de ser 0", 0, pep.anysMatriculat(2018));
		assertEquals("Tindrià de ser 1", 1, joan.anysMatriculat(2018));
		assertEquals("Tindrian de ser 2", 2, marta.anysMatriculat(2018));
	}

	@Test
	public void testPassaASegon() {
		assertTrue("Tindirà de passar a segon.", pep.passaASegon());
		assertTrue("Tindirà de passar a segon.", joan.passaASegon());
		assertFalse("No tindirà de passar a segon.", marta.passaASegon());
	}

}
