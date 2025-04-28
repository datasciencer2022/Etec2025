package multa;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Multa {

	private double valorCompra;
	private LocalDate dtVenc;
	private double valorMulta;
	private double jurosDia;
	
	public void receberDados() {
		valorCompra = Double.parseDouble(
			JOptionPane
			.showInputDialog("Digite o valor da compra")
		);
		String dtVencTmp = 
				JOptionPane
				.showInputDialog("Digite a data do vencimento");
		
		dtVenc = formataData(dtVencTmp);
		jurosDia = Double.parseDouble(
				JOptionPane
				.showInputDialog("Digite o valor do juros ao dia")
			);
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

	
	
	public double getJurosDia() {
		return jurosDia;
	}

	public void setJurosDia(double jurosDia) {
		this.jurosDia = jurosDia;
	}

	public LocalDate formataData (String dtVencTmp) {
		String[] partes = dtVencTmp.split("/");
		int[] partes2 = new int[partes.length];
		for (int i=0; i< partes.length;i++) {
			partes2[i] = Integer.parseInt(partes[i]);
		}
		return LocalDate.of(partes2[2], partes2[1], partes2[0]);
	}

	public double calcularMulta() {
		// obter a data atual
		LocalDate hoje = LocalDate.now();
		
		// acertar os juros
		jurosDia = jurosDia / 100;
		
		// para calcular a multa
		// multiplicar (juros simples)
		// quantDias * juros * valorCompra
		
		return 0;
	}
	
}
