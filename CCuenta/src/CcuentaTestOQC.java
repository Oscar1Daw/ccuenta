import static org.junit.Assert.*;

import org.junit.Test;

public class CcuentaTestOQC{
	
	Ccuenta miCuenta=new Ccuenta("Ana","López",3200,1);

	//1
	@Test
	public void CrearCuentaOQC(){
		assertNotNull(miCuenta);
	}
	
	//2
	@Test
	public void testSaldoOQC() {
		assertEquals(3200, Ccuenta.getSaldo(),0);
	}	
	
	//3
	@Test
	public void testIngresarPositivoOQC() throws Exception{
		miCuenta.ingresar(1000);
		assertEquals(4200,Ccuenta.getSaldo(),0);
		}
	
	//5
	@Test
	public void testRetirarOQC() throws Exception{
		miCuenta.retirar(1000);
		assertEquals(2200, Ccuenta.getSaldo(),0);
		}
	
	//4
	@Test
	public void testIngresarNegativoOQC() throws Exception{
		miCuenta.ingresar(-600);
		assertEquals(3200, Ccuenta.getSaldo(),0);
		}
	
	//6
	@Test
	public void testRetirarDemasidoOQC() throws Exception{
		miCuenta.retirar(4000);
		assertEquals(3200, Ccuenta.getSaldo(),0);
	}
}
