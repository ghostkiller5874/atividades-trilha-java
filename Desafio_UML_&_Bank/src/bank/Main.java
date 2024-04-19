package bank;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Eder");
		ContaCorrente corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		// teve de ser feito cast
		corrente.depositar(800);
		corrente.imprimirExtrato();
		//((ContaCorrente) corrente).imprimirExtrato(); cast

		corrente.transferir(200, poupanca);
		((ContaCorrente) corrente).imprimirExtrato();
		((ContaPoupanca) poupanca).imprimirExtrato();
	}

}
