package edu.eder.TerceiroPack.estabelecimento;

import edu.eder.TerceiroPack.equipamentos.copiadora.Copiadora;
import edu.eder.TerceiroPack.equipamentos.digitalizadora.Digitalizadora;
import edu.eder.TerceiroPack.equipamentos.impressora.Deskjet;
import edu.eder.TerceiroPack.equipamentos.impressora.Impressora;
import edu.eder.TerceiroPack.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Deskjet deskjet = new Deskjet();
		
		Impressora impressora = deskjet;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}

}
