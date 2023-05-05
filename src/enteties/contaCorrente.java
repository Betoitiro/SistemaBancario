package enteties;

public class contaCorrente extends Conta {

	private double chequeEspecial;

	public contaCorrente(Integer numeroConta, Double saldo, String nome) {
		super(numeroConta, saldo, nome);
		this.chequeEspecial = chequeEspecial;
	}


	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	@Override
	public  double sacar(double saldo){
		double saque =0;
		if(saque > saldo) {
			saldo -= chequeEspecial;
		}else {
			saldo -= saque;
		}
		return saldo;
	}


	@Override
	public double depositar(double saldo) {
		double deposito = 0;
		saldo += deposito;
		return saldo;
	}
	
	
	
	
	
	

	
	
}
