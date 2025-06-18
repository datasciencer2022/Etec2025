package principal;

import java.util.Scanner;

import modelo.Cliente;
import utils.UtilsData;

public class Principal {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o cpf:");
		String cpf = ler.next();
		
		cli.setCpf(cpf);
		
		UtilsData utils = new UtilsData();
		
		if (utils.validaCPF(cli.getCpf())) {
			System.out.println("verdadeiro");
		}
		else {
			System.out.println("falso");
		}

		
		
		ler.close();
	}

}
