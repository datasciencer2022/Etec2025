package sorteioGrupos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Grupo;

public class Principal {

	public static void main(String[] args) {
		List<Grupo> lista = new ArrayList<Grupo>();
		
		Grupo grupo1 = new Grupo("A", true);
		Grupo grupo2 = new Grupo("B", true);
		Grupo grupo3 = new Grupo("C", false);
		
		
		lista.add(grupo1);
		lista.add(grupo2);
		lista.add(grupo3);
		
		
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
