package sorteioGrupos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Grupo;

public class Principal {

	public static void main(String[] args) {
		List<Grupo> lista = new ArrayList<Grupo>();
		
		Grupo grupo1 = new Grupo(1,"RangoFast");
		Grupo grupo2 = new Grupo(2,"Tamarillo");
		Grupo grupo3 = new Grupo(3,"I&A Support");
		Grupo grupo4 = new Grupo(4,"Bella Doro");
		Grupo grupo5 = new Grupo(5,"Infinity Store");
		Grupo grupo6 = new Grupo(6,"Megs Açaís");
		Grupo grupo7 = new Grupo(7,"Black Boom");
		
		lista.add(grupo1);
		lista.add(grupo2);
		lista.add(grupo3);
		lista.add(grupo4);
		lista.add(grupo5);
		lista.add(grupo6);
		lista.add(grupo7);
		
		Collections.shuffle(lista);
		
		System.out.println("Ordem de apresentação dos grupos: \n");
		for(int i=0; i<lista.size(); i++) {
			System.out.println("Número "+(i+1) + "\tTema: "+lista.get(i));
		}
	}
}
