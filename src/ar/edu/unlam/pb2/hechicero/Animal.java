package ar.edu.unlam.pb2.hechicero;

public class Animal implements Hechizable {
	private String estado;
	
	
	

	public Animal() {
		this.estado = "Soy un animal entero";
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
