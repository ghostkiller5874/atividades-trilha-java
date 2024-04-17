package uml.aparelho;

import uml.service.AparelhoTelefonico;
import uml.service.NavegadorInternet;
import uml.service.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("PAUSADO");
	}

	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("MUSICA SELECIONADA");
	}

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("EXIBINDO");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("NOVA ABA ADICIONADA");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("PAGINA ATUALIZADA");
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("LIGANDO");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("ATENDEU");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("CORREIO DE VOZ");
	}

}
