package edu.eder.PrimeiroPack;

public class SmartTv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	// liga / desliga
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	
	// altera volume
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
	
	// altera canal
	public void novoCanal(int canal) {
		this.canal = canal;
	}
	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}
	
}
