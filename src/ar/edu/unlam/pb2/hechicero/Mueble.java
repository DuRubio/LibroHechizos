package ar.edu.unlam.pb2.hechicero;

public class Mueble implements Hechizable{
	private String estado;
	
	
	public Mueble() {
		this.estado = "Soy un mueble normalito";
	}
	
	
	
	

	@Override
	public void serDesarmado() {
		estado="Me desarmaron";
		
	}

	@Override
	public String getEstado() {
		return estado;
	}

	@Override
	public void serAgrandado() {
		estado="Ahora soy más grande";
		
	}

}
