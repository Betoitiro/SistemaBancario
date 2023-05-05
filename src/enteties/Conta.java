package enteties;

public abstract class  Conta {

	private Integer numeroConta;
	private Double saldo;
	private String nome;
	
	
	public Conta(Integer numeroConta, Double saldo, String nome) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.nome = nome;
	}
	
	public Conta() {
		
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract double sacar(double saldo);
	public abstract double depositar(double saldo);
	
	@Override
	public String toString() {
	    return "ContaCorrente{" +
	            "numeroConta=" + numeroConta +
	            ", saldo=" + saldo +
	            ", nomeTitular= " + nome;
	}
	

	
	
	
	
	
}
