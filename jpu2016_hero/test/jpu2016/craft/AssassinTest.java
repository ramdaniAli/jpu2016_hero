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

public class AssassinTest extends CraftTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.craft=new Assassin (new Human());

	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testGetHit() throws Exception {
	super.testGetHit();
	final int ExpectedStrength = 5;
	final int ExpectedRange = 0;
	final TypeHit ExpectedTypeHit = TypeHit.NORMAL;
	final Hit hit = this.craft.getHit();
	assertEquals(ExpectedStrength, hit.getStrength());
	assertEquals(ExpectedRange, hit.getRange());
	assertEquals(ExpectedTypeHit, hit.getTypeHit());
	}

	

}
