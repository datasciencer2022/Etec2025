package pacote;
import java.time.LocalDate;

public class TesteDifDatas {	
	public static void main(String[] args) {
		DifDatas exemplo = new DifDatas();
		LocalDate dtIni = LocalDate.of(2025, 4, 1);
		LocalDate dtFim = LocalDate.now();
		long resp = exemplo.calcDif(dtIni, dtFim);
		System.out.println(resp);
	}
}
