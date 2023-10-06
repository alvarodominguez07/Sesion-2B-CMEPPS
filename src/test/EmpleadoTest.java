package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sesion2B.Empleado;
import Sesion2B.Empleado.TipoEmpleado;

class EmpleadoTest {
	
	public enum TipoEmpleado{Vendedor, Encargado};
	private float ventas;
	private float horas;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testCalculoNominaBrutaEncargado() {
		float expected=2500;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, 0, 0);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaNeta() {
		float expected=2000;
		float actual=Empleado.calculoNominaNeta(2000);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaVendedor() {
		float expected=2000;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, 0, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaOtro() {
		float expected=0;
		float actual=Empleado.calculoNominaBruta(null, ventas, horas);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVentasMesNegativaVendedor() {
		float expected=-1;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor , -1, 0);
		assertEquals(expected, actual);
	}
 
	@Test
	void testCalculoNominaBrutaVentasMesMenor1000Vendedor() {
		float expected=2000;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor , 900, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVentasMesEntre1000y1500Vendedor() {
		float expected=2100;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor , 1200, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVentasMesMayor1500Vendedor() {
		float expected=2200;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor , 1600, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaHorasExtrasPositivasVendedor() {
		float expected=2060;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor , 0, 2);
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutahorasHorasExtrasNegativasVendedor() {
		float expected=2000;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor , 0, -1);
		System.out.println("Horas extras negativas : "+actual);
		assertEquals(expected, actual);
	}
	void testCalculoNominaBrutaVentasMesNegativaEncargado() {
		float expected=-1;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado , -1, 0);
		assertEquals(expected, actual);
	}
 
	@Test
	void testCalculoNominaBrutaVentasMesMenor1000Encargado() {
		float expected=2500;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado , 900, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVentasMesEntre1000y1500Encargado() {
		float expected=2600;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado , 1200, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaVentasMesMayor1500Encargado() {
		float expected=2700;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado , 1600, 0);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutaHorasExtrasPositivasEncargado() {
		float expected=2560;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado , 0, 2);
		System.out.println("Horas extras Positivas : "+actual);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaBrutahorasHorasExtrasNegativasEncargado() {
		float expected=2500;
		float actual=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado , 0, -1);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaNetaNegativa() {
		float expected=-1;
		float actual=Empleado.calculoNominaNeta(-1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNetaMenos2100() {
		float expected=2000;
		float actual=Empleado.calculoNominaNeta(2000);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaNetaEntre2100y2500() {
		float expected=1870;
		float actual=Empleado.calculoNominaNeta(2200);
		assertEquals(expected, actual);
	}
	@Test
	void testCalculoNominaNetaMAsde2500() {
		float expected=2132;
		float actual=Empleado.calculoNominaNeta(2600);
		assertEquals(expected, actual);
	}
	}
