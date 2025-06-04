package modelo;

import java.time.LocalDate;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	private LocalDate dtNasc;
	private String email;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cpf, LocalDate dtNasc, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(LocalDate dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome+
				"\tCPF: "+ cpf+
				"\tE-mail: "+ email;
	}
	
}
