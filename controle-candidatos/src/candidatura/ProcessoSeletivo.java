package candidatura;


import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class ProcessoSeletivo {

	public static void main(String[] args) {
		// Array com a lista de candidatos

		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		int contadorSelecionados = 0;
		for(int i = 0; i < candidatos.length && contadorSelecionados < 5;i++) {
			double salarioPretendido = valorPretendido();
			double salarioBase = 2000.0;

				if(salarioPretendido <= salarioBase) {
					System.out.printf("o candidato "+(i +1)+" de nome "+candidatos[i]+", foi selecionado com o salario de %.2f ! %n",salarioPretendido);
					analisarCandidato(salarioPretendido);
					contadorSelecionados++;	
			}
		}
		System.out.println("total de candidatos selecionados "+contadorSelecionados);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("ligar para o candidato");
			ligar();
		}else if(salarioBase == salarioPretendido) {
			System.out.println("ligar para o candidato com contra proposta");
			ligar();
		}else {
			System.out.println("aguardando o resultado dos demais candidatos");
		}
	}
	static void ligar() {
		int tentativas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		for(int i = 0; i < tentativas && tentativas < 3 && continuarTentando;i++) {
			atendeu = atender();			
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativas++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
		}
		if(atendeu) {
			System.out.println("Conseguimos contato com o candidato, tentativas("+(tentativas)+")");
		}else {
			System.out.println("Não foi possivel o contato com o canditato, tentativas("+(tentativas)+")");
		}
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

}
