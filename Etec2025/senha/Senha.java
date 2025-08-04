package senha;
public class Senha {
	private int tamanho;
	private String senha;
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Character[] gerarMaiusculas() {
		Character[] maiusculas = new Character[26];
		for (int i = 0; i < 26; i++) {
		    maiusculas[i] = (char) ('A' + i);
		}
		return maiusculas;
	}
	
	public Character[] gerarMinusculas() {
		Character[] minusculas =  new Character[26];
		for (int i = 0; i < 26; i++) {
		    minusculas[i] = (char) ('a' + i);
		}
		return minusculas;
	}
	
	public Character[] gerarNumeros() {
		Character[] nums = {'0','1','2','3','4',
				'5','6','7','8','9'};
		return nums;
	}
}

