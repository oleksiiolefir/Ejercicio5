package ejercicio5;

import static org.junit.Assert.*;

import org.junit.Test;

public class testEjercicio5 {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	@Test
	public void testConstructor1() {
		meridiano = 107;
		paralelo = 200;
		distancia_tierra = 500;
		Satelite sateliteTest1 = new Satelite(meridiano,paralelo,distancia_tierra);
		
		assertEquals(sateliteTest1.meridiano,107,0);
		assertEquals(sateliteTest1.paralelo,200,0);
		assertEquals(sateliteTest1.distancia_tierra,500,0);
	}
	
	@Test
	public void testConstructor2() {
		Satelite sateliteTest2 = new Satelite();
		
		assertEquals(sateliteTest2.distancia_tierra,0,0);
		assertEquals(sateliteTest2.paralelo,0,0);
		assertEquals(sateliteTest2.meridiano,0,0);
	
	}
	@Test
	public void setPosicionTest()
	{
		double meridianoTest = 345;
		double paraleloTest = 123;
		double distancia_tierraTest = 567;
		
		meridiano = 11;
		paralelo = 22 ;
		distancia_tierra = 44;
		Satelite sateliteTest3 = new Satelite(meridiano,paralelo,distancia_tierra);
		
		sateliteTest3.setPosicion(meridianoTest,paraleloTest,distancia_tierraTest);
		assertEquals(sateliteTest3.meridiano,345,0);
		assertEquals(sateliteTest3.paralelo,123,0);
		assertEquals(sateliteTest3.distancia_tierra,567,0);
	}

	@Test
	public void testOrbita() {
		
		boolean orbitaTest = true;
		double distancia_tierraTest = 0;
		
		equals(orbitaTest==false);

	}
	@Test
	public void testOrbita2() {
		
		boolean orbitaTest2 =true;
		double distancia_tierraTest = 50;
		
		equals(orbitaTest2==true);

	}
	
	
	@Test
	public void variaAlturaTest()
	{
		double desplazamientoTest = 50;
		
		meridiano = 10;
		paralelo = 20;
		distancia_tierra = 40;
		Satelite sateliteTest4 = new Satelite(meridiano,paralelo,distancia_tierra);
		
		sateliteTest4.variaAltura(desplazamientoTest);
		assertEquals(sateliteTest4.distancia_tierra,90,0);
	}
}
