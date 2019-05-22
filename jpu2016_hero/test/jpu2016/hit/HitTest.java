package jpu2016.hit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HitTest {
	
	private Hit hit ; 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.hit = new Hit (1,10,TypeHit.NORMAL);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test 
	public final void testSetStrength ()	{
		
	}
	
	@Test 
	public final void testSetRange()	{
		
	}

	@Test
	public final void testGetStrength() throws Exception {
		final int expected = 1 ; 
		assertEquals(expected, hit.getStrength());
	}

	@Test
	public final void testGetRange() throws Exception {
		final int expected = 10 ; 
		assertEquals(expected, hit.getRange());
	}

	@Test
	public final void testGetTypeHit() {
		final TypeHit expected = TypeHit.NORMAL ; 
		assertEquals(expected, hit.getTypeHit());
	}
	

	@Test
	public final void exceptStrengthMaxStrength()	{
		try {
			new Hit (101, 10,TypeHit.NORMAL);
		}catch (final Exception e ) {
			final String expected  = "Strength out of strength";
			assertEquals(expected, e.getMessage());
		}
		
	}
	@Test
	public final void exceptStrengthMinStrength()	{
		try {
			new Hit (0 , 0,TypeHit.NORMAL);
		}catch (final Exception e ) {
			final String expected  = "Strength out of strength";
			assertEquals(expected, e.getMessage());
		}
		
	}
	
	
	@Test
	public final void exceptRangeMaxRange()	{
		try {
			new Hit (101,11,TypeHit.NORMAL);
		}catch (final Exception e ) {
			final String expected  = "Range out of range";
			assertEquals(expected, e.getMessage());
		}
		
	}
	@Test
	public final void exceptRangeMinRange()	{
		try {
			new Hit (0,0,TypeHit.NORMAL);
		}catch (final Exception e ) {
			final String expected  = "Range out of range";
			assertEquals(expected, e.getMessage());
		}
		
	}

	

}