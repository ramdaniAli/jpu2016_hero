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

/**
 * @author liabe
 *
 */
public class WarriorTest extends CraftTest{

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
	@Before
	public void setUp() throws Exception {
		this.craft = new Warrior (new Human()) ;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}


	/**
	 * Test method for {@link jpu2016.craft.Craft#Craft(jpu2016.hero.IHero)}.
	 */
	@Test
	public final void testCraft() {
		fail("Not yet implemented"); // TODO
	}

}
