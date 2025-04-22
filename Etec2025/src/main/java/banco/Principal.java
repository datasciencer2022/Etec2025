package banco;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o cpf:");
		String cpf = ler.next();
		
		System.out.println("cpf como foi digitado: "+cpf);
		System.out.println("cpf só os números: "+retirar(cpf));
		
	}
	
	public static String retirar (String cpf) {
		String resp = "";
		for (Character c: cpf.toCharArray()) {
			if (Character.isDigit(c)) {
				resp += c;
			}
		}
		
		return resp;
	}
}
