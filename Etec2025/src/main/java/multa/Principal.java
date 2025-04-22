package multa;

public class Principal {
	public static void main(String[] args) {
		Multa multa = new Multa();
		multa.receberDados();
		System.out.println(
				"Valor original: " + multa.getValorCompra());
		System.out.println(
				"Data de vencimento: " + multa.getDataVencto());
		multa.setValorMulta(multa.calcularMulta());
		System.out.println(
				"Valor a pagar: " + (multa.getValorCompra() + valorMulta));
	}
}
