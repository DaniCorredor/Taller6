package Pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.taller2.modelo.ProductoMenu;

public class ProductoMenuTest {
	
	private ProductoMenu productoMenu;
	
	@BeforeEach
	public void setUp() {
		try {
			int precio = 2000;
			String nombre = "bigMac";
			this.productoMenu = new ProductoMenu(nombre, precio);
		}
		catch(Exception e){
			System.out.println("error al crear ProductoMenu");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
	}
	
	@Test
	@DisplayName("Generar Texto Factura")
	public void TestGenerarTextoFactura() {
		
		String factura = productoMenu.getNombre() + "   " + productoMenu.getPrecio();
		
		assertEquals(factura, productoMenu.generarTextoFactura());
	}
	
	
}
