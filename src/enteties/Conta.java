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
	
	public double sacar(double sacar) {
		 saldo -= sacar;
		 return saldo;
		 
		
	}
	
	
	
	
	
	
}
