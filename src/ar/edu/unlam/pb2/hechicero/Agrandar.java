package ar.edu.unlam.pb2.hechicero;

public class Agrandar extends Hechizo {

	
	public Agrandar(String hechizo) {
		super(hechizo);
	}

	@Override
	public void aplicarHechizo(Hechizable hechizado) {
		hechizado.serAgrandado();
		
	}
	
	
	

}
