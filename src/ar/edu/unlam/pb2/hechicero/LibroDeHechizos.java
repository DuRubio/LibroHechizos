package ar.edu.unlam.pb2.hechicero;

import java.util.HashMap;
import java.util.TreeMap;

public class LibroDeHechizos {
	
	private String nombre; 
	private Integer key = 1; 
	public HashMap <String, Hechizo> hechizos;
	
	
	public LibroDeHechizos() {
		hechizos = new HashMap<>();
	}

	public void agregarHechizo(Hechizo hechizo) {
		hechizos.put(hechizo.getConjuro(), hechizo);
		
		
	}

	public Hechizo buscar(String string) {
		return hechizos.get(string);
	}

}
