package edu.eder.TerceiroPack.encapsulamento;

import edu.eder.TerceiroPack.heranca.ServicoMensagemInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem apos herdar");
	}
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem apos herdar");
	}
}
