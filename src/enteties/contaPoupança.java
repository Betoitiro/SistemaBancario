package enteties;

public class contaPoupança extends Conta {

	 private final double taxaDeJuros = 0.3;
	 private double deposito;
		
		
	 public double getDeposito() {
		 return deposito;
	}

	
	public contaPoupança(Integer numeroConta, Double saldo, String nome) {
		super(numeroConta, saldo, nome);
	}

	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	@Override
	public double sacar(double saldo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double depositar(double saldo) {
		saldo = saldo +(deposito * taxaDeJuros);
		return 0;
	}
	
	
	

}
