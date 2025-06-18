package sorteioGrupos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Grupo;

public class Principal {

	public static void main(String[] args) {
		List<Grupo> lista = new ArrayList<Grupo>();
		boolean podeHoje = true;
		boolean naoPodeHoje = false;
		
		Grupo grupo1 = new Grupo("Lavagem das mãos", podeHoje);
		Grupo grupo2 = new Grupo("Aleitamento", naoPodeHoje);
		Grupo grupo3 = new Grupo("Circulação Materno Fetal", podeHoje);
		Grupo grupo4 = new Grupo("Doença de Cron", naoPodeHoje);
		Grupo grupo5 = new Grupo("AVE", naoPodeHoje);
		Grupo grupo6 = new Grupo("Prevenção e Controle de Infecção", naoPodeHoje);
		
		
		
		lista.add(grupo1);
		lista.add(grupo2);
		lista.add(grupo3);
		lista.add(grupo4);
		lista.add(grupo5);
		lista.add(grupo6);
		
		Collections.shuffle(lista);
		
		int num = 1;
		System.out.println("Ordem de apresentação dos grupos: \n");
		for(Grupo g: lista) {
			if (g.isPodeHoje()) {
				System.out.println("Número "+ num + "\tTema: "+g);
				num++;
			}
		}
	}
}
