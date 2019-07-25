package ar.com.grupoesfera.meli.streams;

public class Documento {

	public enum Tipo {
		DNI, CI, LE, LC, PASAPORTE;
	}
	
	private Tipo tipo;
	private String identificador;
	
	public Tipo getTipo() {
	
		return tipo;
	}
	
	public void setTipo(Tipo tipo) {
	
		this.tipo = tipo;
	}
	
	public String getIdentificador() {
	
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
	
		this.identificador = identificador;
	}
	
	public static Documento nuevo(Tipo tipo, String identificador) {
		
		Documento nuevo = new Documento();
		
		nuevo.setTipo(tipo);
		nuevo.setIdentificador(identificador);
		
		return nuevo;
	}
}
