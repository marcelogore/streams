package ar.com.grupoesfera.meli.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.com.grupoesfera.meli.streams.Documento.Tipo;

public class ObjectTest {
	
	private final List<Usuario> usuarios = new ArrayList<>();
	
	@Before
	public void inicializarDatos() {
		
		Direccion casa = Direccion.nueva("Francia", "2272");
		
		usuarios.add(Usuario.nuevo()
				.conNombre("Marcelo")
				.conEdad(37)
				.conDocumento(Documento.nuevo(Tipo.DNI, "29477860"))
				.conDomicilio(casa));

		usuarios.add(Usuario.nuevo()
				.conNombre("India")
				.conEdad(4)
				.conDocumento(Documento.nuevo(Tipo.PASAPORTE, "ABB1728"))
				.conDomicilio(casa));

		usuarios.add(Usuario.nuevo()
				.conNombre("Ariel")
				.conEdad(33)
				.conDocumento(Documento.nuevo(Tipo.DNI, "31293774"))
				.conDomicilio(Direccion.nueva("Avenida Siempre Viva", "1234")));

		usuarios.add(Usuario.nuevo()
				.conNombre("Estefania")
				.conEdad(20)
				.conDocumento(Documento.nuevo(Tipo.DNI, "39278733"))
				.conDomicilio(Direccion.nueva("Avenida Sarasa", "1235")));

		usuarios.add(Usuario.nuevo()
				.conNombre("Ana")
				.conEdad(65)
				.conDocumento(Documento.nuevo(Tipo.LC, "7275633"))
				.conDomicilio(Direccion.nueva("Avenida Sarasa", "1411")));
	}
	
	@Test
	public void deberiaCompilarListaDeNombres() {
		
		Assert.assertThat(usuarios.stream().map(u -> u.getNombre()).collect(Collectors.toList()), Matchers.containsInAnyOrder("Marcelo", "India", "Ariel", "Estefania", "Ana"));
	}

	@Test
	public void deberiaCompilarListaDeNombresQueEmpiezanConA() {
		
		Assert.assertThat(usuarios.stream().map(u -> u.getNombre()).filter(n -> n.startsWith("A")).collect(Collectors.toList()), Matchers.containsInAnyOrder("Ariel", "Ana"));
	}
}
