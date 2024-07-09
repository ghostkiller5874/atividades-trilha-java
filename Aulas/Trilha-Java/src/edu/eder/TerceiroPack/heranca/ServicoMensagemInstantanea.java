package edu.eder.TerceiroPack.heranca;

public abstract class ServicoMensagemInstantanea {
	/*
	public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		
		System.out.println("Enviando mensagem");
		
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
	
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
	*/
	
	//ABSTRAÇÃO
	// constroi algo generico que os filhos decidem oq acontecera, qndo herdar. mas para isso esta classe(" ServicoMensagemIntantanea ") deve se tornar abstract
	public void enviarMensagem() {
		
	}
	public void receberMensagem() {
		
	}
	// aplicando um pouco de polimorfismo
	protected void validarConectadoInternet() {
		System.out.println("Esta online");
	}
}
