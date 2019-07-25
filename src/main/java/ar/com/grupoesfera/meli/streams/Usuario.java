package ar.com.grupoesfera.meli.streams;

public class Usuario {

	private String nombre;
	private Documento documento;
	private Direccion domicilio;
	private Integer edad;

	public String getNombre() {
	
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public Documento getDocumento() {
		
		return documento;
	}
	
	public void setDocumento(Documento documento) {
		
		this.documento = documento;
	}
	
	public Direccion getDomicilio() {
		
		return domicilio;
	}
	
	public void setDomicilio(Direccion domicilio) {
		
		this.domicilio = domicilio;
	}
	
	public Integer getEdad() {
		
		return edad;
	}
	
	public void setEdad(Integer edad) {
		
		this.edad = edad;
	}
	
	public static Usuario nuevo() {
		
		return new Usuario();
	}
	
	public Usuario conNombre(String nombre) {
		
		setNombre(nombre);
		return this;
	}

	public Usuario conDocumento(Documento documento) {
		
		setDocumento(documento);
		return this;
	}

	public Usuario conDomicilio(Direccion domicilio) {
		
		setDomicilio(domicilio);
		return this;
	}
	
	public Usuario conEdad(Integer edad) {
		
		setEdad(edad);
		return this;
	}
}
