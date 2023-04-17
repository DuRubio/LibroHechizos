package ar.edu.unlam.pb2.hechicero;

import org.junit.Assert;
import org.junit.Test;

public class MagiaTest {

	
	
	@Test
	public void queSePuedaAgregarUnHechizoAlLibro() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo desarme = new Expelliarmus();
		libro.agregarHechizo(desarme);
		Assert.assertEquals(desarme, libro.buscar("expelliarmus"));
	}
	
	@Test
	public void verSiUnHechizableEstaHechizado() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Expelliarmus desarme = new Expelliarmus();
		Hechizable perro = new Animal(); // es interfaz porque es +able
		libro.agregarHechizo(desarme);
		Hechizo hechizo = libro.buscar("expelliarmus");  // Hechizo es abstracta porque no está inicializada con el new y recibe info. Y es SuperClase porque tiene hijo (linea13)
		hechizo.aplicarHechizo(perro);
		Assert.assertEquals("Me desarmaron", perro.getEstado());
		
	}
	
	@Test
	public void verSiUnHehizableCrece() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Hechizo crecer = new Agrandar("enormuvus");
		Hechizable mesa = new Mueble();
		libro.agregarHechizo(crecer);
		Hechizo hechizo = libro.buscar("enormuvus");
		hechizo.aplicarHechizo(mesa);
		Assert.assertEquals("Ahora soy más grande", mesa.getEstado());
		
	}
}
