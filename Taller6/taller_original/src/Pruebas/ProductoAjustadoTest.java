package Pruebas;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.taller2.modelo.Ingrediente;
import uniandes.dpoo.taller2.modelo.ProductoAjustado;
import uniandes.dpoo.taller2.modelo.ProductoMenu;

public class ProductoAjustadoTest {
	
private ProductoAjustado productoAjuestado;
	
	private ProductoAjustado productoAjustado;

	@BeforeEach
	public void setUp() {
		try {
			ProductoMenu productoMenu = new ProductoMenu("papas", 2000);
			this.productoAjustado = new ProductoAjustado(productoMenu);
		}
		catch(Exception e){
			System.out.println("error al crear productoAjuestado");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
	}
	
	@Test
	@DisplayName("Agregar Ingrediente")
	public void testAgregarIngrediente() {
        
		String nom1 = "lechuga";
		int precio1 = 1000;
		Ingrediente ingrediente1 = new Ingrediente(nom1, precio1);
		productoAjustado.agregarIngrediente(ingrediente1);
		
        assertEquals("lechuga", productoAjustado.getAgregados().get(0).getNombre());
		
	}
	
	@Test
	@DisplayName("Get agregados")
	public void testGetAgregados() {
        
		String nom1 = "lechuga";
		int precio1 = 1000;
		Ingrediente ingrediente1 = new Ingrediente(nom1, precio1);
		productoAjustado.agregarIngrediente(ingrediente1);
		
        assertEquals("lechuga", productoAjustado.getAgregados().get(0).getNombre());
		
	}
	
	@Test
	@DisplayName("Eliminados Ingrediente")
	public void testEliminarIngrediente() {
        
		String nom1 = "lechuga";
		int precio1 = 1000;
		Ingrediente ingrediente1 = new Ingrediente(nom1, precio1);
		productoAjustado.agregarIngrediente(ingrediente1);
		productoAjustado.eliminarIngrediente(ingrediente1);
		
        assertEquals("lechuga", productoAjustado.getEliminados().get(0).getNombre());
		
	}
	
	@Test
	@DisplayName("Get Eliminados")
	public void testGetEliminados() {
        
		String nom1 = "lechuga";
		int precio1 = 1000;
		Ingrediente ingrediente1 = new Ingrediente(nom1, precio1);
		productoAjustado.agregarIngrediente(ingrediente1);
		productoAjustado.eliminarIngrediente(ingrediente1);
		
        assertEquals("lechuga", productoAjustado.getEliminados().get(0).getNombre());
		
	}
	
	@Test
	@DisplayName("Get Precio")
	public void testGetPrecio() {
        
		String nom1 = "lechuga";
		String nom2 = "tomate";
		int precio1 = 1000;
		int precio2 = 1000;
		Ingrediente ingrediente1 = new Ingrediente(nom1, precio1);
		Ingrediente ingrediente2 = new Ingrediente(nom2, precio2);
		productoAjustado.agregarIngrediente(ingrediente1);
		productoAjustado.agregarIngrediente(ingrediente2);
		
        assertEquals(4000, productoAjustado.getPrecio());
		
	}
	
	@Test
	@DisplayName("Generar Factura")
	public void TestGenerarTextoFactura() {
		
		String nom1 = "lechuga";
		String nom2 = "tomate";
		int precio1 = 1000;
		int precio2 = 1000;
		Ingrediente ingrediente1 = new Ingrediente(nom1, precio1);
		Ingrediente ingrediente2 = new Ingrediente(nom2, precio2);
		productoAjustado.agregarIngrediente(ingrediente1);
		productoAjustado.agregarIngrediente(ingrediente2);
		
		String factura = "papas" + "   " + 2000;
		factura += "\n + " + ingrediente1.generarTextoFactura();
		factura += "\n + " + ingrediente2.generarTextoFactura();
		
		assertEquals(factura, productoAjustado.generarTextoFactura(), "generarTextoFactura funciona");
	}
	
	
	
}
