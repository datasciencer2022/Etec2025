package pacote;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DifDatas {
	//calcular quantos dias de diferença
	public long calcDif(LocalDate dtIni,
			LocalDate dtFim) {
		long resp = 
			ChronoUnit.DAYS.between(dtIni, dtFim);
		// aqui vai o código
		return resp;
	}
}
