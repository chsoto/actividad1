package cl.ubb.agil;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class productoTest {
	@Test
	public void StockNoValido(){
		Producto prod = new Producto(null, 0, 0);
		prod.isBajoStock();
		
	}
	
	@Test
	public void StockFaltanteEsTres(){
		Producto prod= new Producto("Gibson epiphone", 3, 5, null);
		assertThat(prod.getStockFaltante(),is(3));
	}
	@Test
	public void StockFaltanteEsSeis(){
		Producto prod= new Producto("Gibson ", 0, 6, null);
		assertThat(prod.getStockFaltante(),is(6));
	}
	@Test
	public void ExistenciaSinCodigo(){
		Producto prod=new Producto(null, 0, 0, null);
		Existencia existen= new Existencia(" ");
		assertThat(existen.getNumero(),is(" "));
	}
	@Test 
	public void AgregarExistenciaNumero557(){
		Existencia existen= new Existencia("557");
		Producto prod=new Producto(null, 7, 10, null);
		prod.addExistencia(existen);
	}

}
