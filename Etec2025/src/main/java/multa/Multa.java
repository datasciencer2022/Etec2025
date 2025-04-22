package multa;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Multa {

	private double valorCompra;
	private LocalDate dtVenc;
	private double valorMulta;
	
	public void receberDados() {
		valorCompra = Double.parseDouble(
			JOptionPane
			.showInputDialog("Digite o valor da compra")
		);
		String dtVencTmp = 
				JOptionPane
				.showInputDialog("Digite a data do vencimento");
		
		dtVenc = formataData(dtVencTmp);
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public LocalDate getDtVenc() {
		return  dtVenc;
	}
	
	public String getDataVencto() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		java.sql.Date data = java.sql.Date.valueOf(dtVenc);
		return  sdf.format(data);
	}

	public void setDtVenc(LocalDate dtVenc) {
		this.dtVenc = dtVenc;
	}

	public double getValorMulta() {
		return valorMulta;
	}

	public void setValorMulta(double valorMulta) {
		this.valorMulta = valorMulta;
	}

	public LocalDate formataData (String dtVencTmp) {
		String[] partes = dtVencTmp.split("/");
		int[] partes2 = new int[3];
		for (int i=0; i< partes.length;i++) {
			partes2[i] = Integer.parseInt(partes[i]);
		}
		return LocalDate.of(partes2[2], partes2[1], partes2[0]);
	}

	public double calcularMulta() {
		// calcular numero de dias em atraso
		
		// multiplicar dias por juros
		return 0;
	}
	
}
