package bank;

//import java.util.ArrayList;

public abstract class Conta{
	//ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	private static final Integer AGENCIA_PADRAO = 1;
	private static Integer SEQUENCIAL = 1;
	
	protected Integer agencia;
	protected Integer numero;
	protected Cliente cliente;
	protected Double saldo = 0.0;
	
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public Integer getAgencia() {
		return agencia;
	}
	public Integer getNumero() {
		return numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	// METODOS
	public double sacar(double valor) {
		return saldo-=valor;
	}
	public double depositar(double valor) {
		return saldo+=valor;
	}
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void extrato() {
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Numero: %d", numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	
	
}
