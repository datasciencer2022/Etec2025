package modelo;

public class Grupo {

	private int id;
	private String tema;
	
	public Grupo() {
		
	}

	public Grupo(int id, String tema) {
		super();
		this.id = id;
		this.tema = tema;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	@Override
	public String toString() {
		return "Tema: "+tema;
	}
}
