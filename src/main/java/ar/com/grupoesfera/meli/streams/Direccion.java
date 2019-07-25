package ar.com.grupoesfera.meli.streams;

public class Direccion {

	private String calle;
	private String numero;
	
	public String getCalle() {
	
		return calle;
	}
	
	public void setCalle(String calle) {
	
		this.calle = calle;
	}
	
	public String getNumero() {
	
		return numero;
	}
	
	public void setNumero(String numero) {
	
		this.numero = numero;
	}
	
	public static Direccion nueva(String calle, String numero) {
		
		Direccion nueva = new Direccion();
		
		nueva.setCalle(calle);
		nueva.setNumero(numero);
		
		return nueva;
	}
}
