package pacote;

import java.time.LocalDate;

public class UtilsData {

	public String formataLocalDate(LocalDate data) {
		return data.getDayOfMonth() +
				"/" + data.getMonthValue() +
				"/" + data.getYear();
	}
}
