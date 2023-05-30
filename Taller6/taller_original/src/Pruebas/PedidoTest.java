package Pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import uniandes.dpoo.taller2.modelo.Pedido;
import uniandes.dpoo.taller2.modelo.Producto;
import uniandes.dpoo.taller2.modelo.ProductoMenu;

public class PedidoTest {
	
	private Pedido pedido;
	
	@BeforeEach
	public void setUp() {		
		try {
			
			this.pedido = new Pedido("Daniel", "calle 100");
			
		}
		catch(Exception e) {
			System.out.println("error al crear Pedido");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}	
	}
	
	@Test
	@DisplayName("Get ID Pedido")
	public void testGetIdPedido() {
        
        assertEquals(1, pedido.getIdPedido());
		
	}
	
	
	@Test
	@DisplayName("Agregar Producto")
	public void testAgregarProducto() {
        
		 Producto producto = new ProductoMenu("papas", 2000);
		 pedido.agregarProducto(producto);
		
        assertEquals("papas", pedido.getItemsPedido().get(0).getNombre());
		
	}
	
	@Test
	@DisplayName("Get ItemsPedido")
	public void testGetItemsPedido() {
        
		 Producto producto = new ProductoMenu("papas", 2000);
		 pedido.agregarProducto(producto);
		
        assertEquals("papas", pedido.getItemsPedido().get(0).getNombre());
		
	}
	
	@Test
	@DisplayName("Get Precio Total Pedido")
	public void testGetPrecioTotalPedido() {
        
		 Producto producto = new ProductoMenu("papas", 2000);
		 pedido.agregarProducto(producto);
		 pedido.agregarProducto(producto);
		
        assertEquals(4000, pedido.getPrecioTotalPedido());
		
	}
	
	
}
