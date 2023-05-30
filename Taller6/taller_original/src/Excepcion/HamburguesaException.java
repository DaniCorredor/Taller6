package Excepcion;

public abstract class HamburguesaException extends Exception{
	
	public HamburguesaException() {
		
	}
	
	public HamburguesaException(String mensaje) {
		super(mensaje);
	}
		
}
