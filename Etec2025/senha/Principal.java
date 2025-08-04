package senha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {
  public static void main(String[] args) {
	Senha s = new Senha();
	Character[] maiusculas = s.gerarMaiusculas();
	Character[] minusculas = s.gerarMinusculas();
	Character[] nums = s.gerarNumeros();
	List<Character> tudo = 
			new ArrayList<Character>();
		
	for(Character c: maiusculas) {
		tudo.add(c);
	}
	for(Character c: minusculas) {
		tudo.add(c);
	}
	for(Character c: nums) {
		tudo.add(c);
	}
		
	Random random = new Random();
	StringBuilder sb = null;
	
	for (int i=8; i<=12; i++) {
		sb = new StringBuilder();
		for (int j=0; j<i; j++) {
			 int min = 1;
		     int max = (tudo.size()-1);
		     int sorteado = random.nextInt(
		    		 max - min + 1) + min;
		     sb.append(tudo.get(sorteado));
		}
		System.out.println("Com "+i+
			" caracteres:\t"+sb.toString());
	}
 }
}

