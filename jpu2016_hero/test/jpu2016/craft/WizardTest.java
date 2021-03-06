/**
 * 
 */
package jpu2016.craft;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jpu2016.hero.Human;
import jpu2016.hit.Hit;
import jpu2016.hit.TypeHit;

/**
 * @author liabe
 *
 */
public class WizardTest extends CraftTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		this.craft=new Wizard (new Human());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Override
	@Test
	public void testGetHit() throws Exception {
	super.testGetHit();
	final int ExpectedStrength = 3;
	final int ExpectedRange = 5;
	final TypeHit ExpectedTypeHit = TypeHit.MAGIC;
	final Hit hit = this.craft.getHit();
	assertEquals(ExpectedStrength, hit.getStrength());
	assertEquals(ExpectedRange, hit.getRange());
	assertEquals(ExpectedTypeHit, hit.getTypeHit());
	}


}
