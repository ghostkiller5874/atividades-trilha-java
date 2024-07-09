package edu.eder.PrimeiroPack;
	 /**
	 * <b>Note:</b> atividades feitas em aula e explicacoes extras
	 * 
	 * 
	 * @author Eder Moreira
	 * @since 19/03/2024
	 * 
	 */
public class Metodos {
	
	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Tv esta ligada? "+ smartTv.ligada);
		smartTv.ligar();
		System.out.println("Tv ligou? "+smartTv.ligada);
		smartTv.aumentarVolume();
		System.out.println("aumentou o volume: "+smartTv.volume);
		System.out.println("o canal agora é: "+smartTv.canal);
		smartTv.novoCanal(15);
		System.out.println("o canal agora é: "+smartTv.canal);
	}

}
