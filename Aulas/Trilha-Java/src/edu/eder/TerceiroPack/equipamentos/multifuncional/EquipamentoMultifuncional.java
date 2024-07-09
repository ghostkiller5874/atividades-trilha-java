package edu.eder.TerceiroPack.equipamentos.multifuncional;

import edu.eder.TerceiroPack.equipamentos.copiadora.Copiadora;
import edu.eder.TerceiroPack.equipamentos.digitalizadora.Digitalizadora;
import edu.eder.TerceiroPack.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora,Impressora,Digitalizadora{

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO MULTIFUNCIONAL");
		
	}

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO MULTIFUNCIONAL");
		
	}

	@Override
	public void copiar() {
		System.out.println("COPIANDO MULTIFUNCIONAL");
		
	}

}
