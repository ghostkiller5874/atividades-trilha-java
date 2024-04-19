package bank;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println(" === EXTRATO CONTA CORRENTE ===");
		super.extrato();
	}

}
