package edu.eder.QuartoPack.EqualsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Carro> listacarro = new ArrayList<>();
		
		listacarro.add(new Carro("Ford"));
		listacarro.add(new Carro("Fiat"));
		listacarro.add(new Carro("Chevrolet"));
		listacarro.add(new Carro("Volkswagen"));
		
		//System.out.println(listacarro.contains(new Carro("Ford"))); // aqui esta vendo se dentro da lista contain/contem o objeto, cujo o atributo no caso marca é, "ford"
		//System.out.println(new Carro("Ford").hashCode());
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("Ford");
		
		System.out.println(carro1.equals(carro2));
		
		
	
	
	}

}
