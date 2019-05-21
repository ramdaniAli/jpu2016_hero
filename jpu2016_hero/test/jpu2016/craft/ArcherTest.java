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

public class ArcherTest extends CraftTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Override
	@Before
	public void setUp() throws Exception {
		this.craft=new Archer (new Human());

	}

	@After
	public void tearDown() throws Exception {
	}

	@Override
	@Test
	public void testGetHit() throws Exception {
	super.testGetHit();
	final int ExpectedStrength = 2;
	final int ExpectedRange = 8;
	final TypeHit ExpectedTypeHit = TypeHit.NORMAL;
	final Hit hit = this.craft.getHit();
	assertEquals(ExpectedStrength, hit.getStrength());
	assertEquals(ExpectedRange, hit.getRange());
	assertEquals(ExpectedTypeHit, hit.getTypeHit());
	}

}
