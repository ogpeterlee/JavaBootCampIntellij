package sample;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyCalTest2 {
	private MyCalculator theCalculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		theCalculator = new MyCalculator();
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
@Test
public void testGetSum() {
		
		int a = 5;
		int b = 10;			
		//	Checks the sum of two (2) positive values
		assertEquals(15, (theCalculator.getSum(a,b)));
		assertEquals(15, (theCalculator.getSum(b,a)));		

		a = -5;		
		b = 10;		
		//	Checks the sum of a postive value and a negative value
		assertEquals(5, (theCalculator.getSum(a,b)));
		assertEquals(5, (theCalculator.getSum(b,a)));
		
		a = -5;		
		b = -10;		
		//	Checks the sum of two (2) negative values
		assertEquals(-15, (theCalculator.getSum(a,b)));
		assertEquals(-15, (theCalculator.getSum(b,a)));
	}

}
