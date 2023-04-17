package ar.edu.unlam.pb2.hechicero;

public class Expelliarmus extends Hechizo {

	public Expelliarmus() {
		super("expelliarmus");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aplicarHechizo(Hechizable hechizado) {
		hechizado.serDesarmado();
		
	}
	
	

}
