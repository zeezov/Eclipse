package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cities.CityApp;

public class PublicTesrs {

	CityApp ca;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ca = new CityApp();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCamelCase1() {
		String expected = "Los Angeles";
		String result = ca.camelCase("los angeles   ");
		assertEquals(expected, result);
	}

	
	@Test
	public void testCamelCase2() {
		String expected = "San Antonio";
		String result = ca.camelCase("San antonio");
		assertEquals(expected, result);
	}
	
	@Test
	public void testCamelCase3() { 
		String expected = "My Name Is Alice.";
		String result = ca.camelCase("my name is alice.");
		assertEquals(expected, result);
	}
	
	@Test
	public void testPopulation1() { 
		int expected = 8405837;
		int result = ca.population("new york");
		assertEquals(expected, result);
	}
	
	@Test
	public void testPopulation2() { 
		int expected = -1;
		int result = ca.population("fairfax");
		assertEquals(expected, result);
	}
	
	
	@Test
	public void testPopulation3() { 
		int expected = 268738;
		int result = ca.population("Lincoln");
		assertEquals(expected, result);
	}
	
	@Test
	public void testPopulation4() { 
		int expected = 622104;
		int result = ca.population("baltimore");
		assertEquals(expected, result);
	}
	
	
	@Test
	public void testPopulation5() { 
		int expected = 1409019;
		int result = ca.population("San Antonio");
		assertEquals(expected, result);
	}
	
	
	@Test
	public void testPopulation6() { 
		int expected = 148892;
		int result = ca.population("alexandria");
		assertEquals(expected, result);
	}
	
	@Test
	public void testState1() { 
		String expected = "New York";
		String result = ca.state("new york");
		assertEquals(expected, result);
	}
	
	@Test
	public void testState2() { 
		String expected = null;
		String result = ca.state("city");
		assertEquals(expected, result);
	}
	
	
	@Test
	public void testState3() { 
		String expected = "Nebraska";
		String result = ca.state("Lincoln");
		assertEquals(expected, result);
	}
	
	@Test
	public void testCityRank1() { 
		String expected = "Houston";
		String result = ca.cityByRank(4);
		assertEquals(expected, result);
	}
	
	@Test
	public void testCityRank2() { 
		String expected = "Chicago";
		String result = ca.cityByRank(3);
		assertEquals(expected, result);
	}
	
	@Test
	public void testCityRank3() { 
		String expected = "Baltimore";
		String result = ca.cityByRank(26);
		assertEquals(expected, result);
	}
	
	
	@Test
	public void testCitiesInState1() { 
		int expected = 7;
		int result = ca.CitiesInState("maryland");
		assertEquals(expected, result);
	}
	
	@Test
	public void testCitiesInState2() { 
		int expected = 1;
		int result = ca.CitiesInState("maine");
		assertEquals(expected, result);
	}
	
	
	@Test
	public void testCitiesInState3() { 
		int expected = 212;
		int result = ca.CitiesInState("california");
		assertEquals(expected, result);
	}
	
	@Test
	public void testDistance1() { 
		int expected = 711;
		int result = (int)ca.distance("chicago","new York");
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testDistance2() { 
		int expected = 593;
		int result = (int)ca.distance("chicago","washington");	
		assertEquals(expected, result);
	}
	
	@Test
	public void testDistance3() { 
		int expected = 1903;
		int result = (int)ca.distance("buffalo","phoenix");	
		assertEquals(expected, result);
	}
	
	@Test
	public void testLatitude1() { 
		double expected = 33.7739053;
		double result = ca.latitude("Garden Grove");
		assertEquals((int)expected,(int) result);
	}
	@Test
	public void testLatitude2() { 
		double expected = 26.1224386;
		double result = ca.latitude("fort lauderdale");
		assertEquals((int)expected,(int) result);
	}
	@Test
	public void testLatitude3() { 
		double expected = -1;
		double result = ca.latitude("fort Pauderdale");
		assertEquals((int)expected,(int) result);
	}
	@Test
	public void testLongitude() { 
		double expected = -118.1164613;
		double result = ca.longitude("Palmdale");
		assertEquals((int)expected,(int) result);
	}
	@Test
	public void testLongitude2() { 
		double expected = -1;
		double result = ca.longitude("PalmdaleDo");
		assertEquals((int)expected,(int) result);
	}
}
