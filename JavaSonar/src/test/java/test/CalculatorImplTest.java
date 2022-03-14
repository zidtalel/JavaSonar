package test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Calculator;
import main.CalculatorImpl;

public class CalculatorImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAvecIF1() {
		Calculator  calc = new CalculatorImpl();
		int a, b, resultatAttendu;
		//Cas de test a et b positif 
		a = 5; 
        b = 5;
        resultatAttendu = a + b;
        assertTrue(calc.add(a, b) == resultatAttendu, 
		"Cas de test : a et b positif.\na = " 
		+ a + "\nb = " + b + "\nRésultats attendus : " 
		+ resultatAttendu + "\nRésultats obtenus : " + calc.add(a, b));
    }
	
	@Test
	public void testAddAvecIF2() {
		Calculator  calc = new CalculatorImpl();
		int a, b, resultatAttendu;
		//Cas de test a et b positif 
		a = -3; 
        b = 5;
        resultatAttendu = a + b;
        assertTrue(calc.add(a, b) == resultatAttendu, 
		"Cas de test : a et b positif.\na = " 
		+ a + "\nb = " + b + "\nRésultats attendus : " 
		+ resultatAttendu + "\nRésultats obtenus : " + calc.add(a, b));	
   }
	
	@Test
	public void testAddAvecIF3() {
		Calculator  calc = new CalculatorImpl();
		int a, b, resultatAttendu;
		//Cas de test a et b positif 
		a = 5; 
        b = -8;
        resultatAttendu = a + b;
        assertTrue(calc.add(a, b) == resultatAttendu, 
		"Cas de test : a et b positif.\na = " 
		+ a + "\nb = " + b + "\nRésultats attendus : " 
		+ resultatAttendu + "\nRésultats obtenus : " + calc.add(a, b));
	}
	@Test
	public void testAddAvecIF4() {
		Calculator  calc = new CalculatorImpl();
		int a, b, resultatAttendu;
		//Cas de test a et b positif 
		a = -5; 
        b = -7;
        resultatAttendu = a + b;
        assertTrue(calc.add(a, b) == resultatAttendu, 
		"Cas de test : a et b positif.\na = " 
		+ a + "\nb = " + b + "\nRésultats attendus : " 
		+ resultatAttendu + "\nRésultats obtenus : " + calc.add(a, b));
    }
	 
	@Test
	public void testAddAvecIF5() {
		Calculator  calc = new CalculatorImpl();
		int a, b, resultatAttendu;
		//Cas de test a et b positif 
		a = 0; 
        b = 5;
        resultatAttendu = a + b;
        assertTrue(calc.add(a, b) == resultatAttendu, 
		"Cas de test : a et b positif.\na = " 
		+ a + "\nb = " + b + "\nRésultats attendus : " 
		+ resultatAttendu + "\nRésultats obtenus : " + calc.add(a, b));	
    }
	
	@Test
	public void testAddAvecIF6() {
		Calculator  calc = new CalculatorImpl();
		int a, b, resultatAttendu;
		//Cas de test a et b positif 
		a = 5; 
        b = 0;
        resultatAttendu = a + b;
        assertTrue(calc.add(a, b) == resultatAttendu, 
		"Cas de test : a et b positif.\na = " 
		+ a + "\nb = " + b + "\nRésultats attendus : " 
		+ resultatAttendu + "\nRésultats obtenus : " + calc.add(a, b));	
    }
	
	@Test
	public void testAddAvecIF7() {
		Calculator  calc = new CalculatorImpl();
		int a, b, resultatAttendu;
		//Cas de test a et b positif 
		a = 0; 
        b = 0;
        resultatAttendu = a + b;
        assertTrue(calc.add(a, b) == resultatAttendu, 
		"Cas de test : a et b positif.\na = " 
		+ a + "\nb = " + b + "\nRésultats attendus : " 
		+ resultatAttendu + "\nRésultats obtenus : " + calc.add(a, b));	
    }

	@Test
	public void testSubstract() {
		fail("Not yet implemented");
	}

	@Test
	public void testMerge() {
		fail("Not yet implemented");
	}

}
