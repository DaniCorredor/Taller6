package Pruebas;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.taller2.modelo.Combo;
import uniandes.dpoo.taller2.modelo.ProductoMenu;

public class ComboTest {
	
	private Combo combo;
	
	@BeforeEach
	public void setUp() {
		try {
			double descuento = 0;
			String nombre = "bigMac";
			this.combo = new Combo(descuento, nombre);
		}
		catch(Exception e){
			System.out.println("error al crear combo");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
	}
	
	@Test
	@DisplayName("Agregar ItemCombo")
	public void TestAgregarItemACombo() {
		
		String nom1 = "hamburguesa";
		String nom2 = "papas";
		int precio1 = 5000;
		int precio2 = 1000;
		ProductoMenu producto1 = new ProductoMenu(nom1, precio1);
		ProductoMenu producto2 = new ProductoMenu(nom2, precio2);
		combo.agregarItemACombo(producto1);
		combo.agregarItemACombo(producto2);
		ArrayList<ProductoMenu> lista = combo.getItemsCombo();
		String prueba1 = lista.get(0).getNombre();
		String prueba2 = lista.get(1).getNombre();
		assertAll(
        		()-> assertEquals(nom1,(prueba1)),
        		()-> assertEquals(nom2,(prueba2))
        		);
		
	}
	
	
	@Test
	@DisplayName("Generar Factura")
	public void TestGenerarTextoFactura() {
		
		String nom1 = "hamburguesa";
		String nom2 = "papas";
		int precio1 = 5000;
		int precio2 = 1000;
		ProductoMenu producto1 = new ProductoMenu(nom1, precio1);
		ProductoMenu producto2 = new ProductoMenu(nom2, precio2);
		combo.agregarItemACombo(producto1);
		combo.agregarItemACombo(producto2);
		
		String factura = combo.getNombre() + "   " + combo.getPrecio();
		factura += "\n * " + nom1;
		factura += "\n * " + nom2;
		
		assertEquals(factura, combo.generarTextoFactura(), "generarTextoFactura funciona");
	}

	
	
}
