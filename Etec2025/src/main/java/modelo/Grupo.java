package modelo;

public class Grupo {

	private String tema;
	private boolean podeHoje;
	
	public Grupo() {
		
	}

	public Grupo(String tema, boolean podeHoje) {
		super();
		this.tema = tema;
		this.podeHoje = podeHoje;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
	
	public boolean isPodeHoje() {
		return podeHoje;
	}

	public void setPodeHoje(boolean podeHoje) {
		this.podeHoje = podeHoje;
	}

	@Override
	public String toString() {
		return tema;
	}
}
