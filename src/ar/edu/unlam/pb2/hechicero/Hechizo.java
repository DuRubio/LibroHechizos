package ar.edu.unlam.pb2.hechicero;

public abstract class Hechizo {
	private String conjuro;
	
	
	public Hechizo (String conjuro) {
		this.conjuro=conjuro;
	}


	protected String getConjuro() {
		return conjuro;
	}


	public abstract void aplicarHechizo(Hechizable hechizado);
	
	
	
	
}
