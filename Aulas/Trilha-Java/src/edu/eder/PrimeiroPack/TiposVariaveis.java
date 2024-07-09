package edu.eder.PrimeiroPack;

public class TiposVariaveis {

	public static void main(String[] args) {
		/*
		 * para numeros iniciados em zero, prefira coloca-lo como string. pois o java ignoraria o zero, exemplo: cpf
		 */
		
		long cpf = 98765432109L;//o mesmo caso do float, tem q colocar a letra "l" no final para ele entender q é um long
		
		float pi = 3.14F;//tem q colocar um "f" no final pois esse tipo exige, do contrario teria de converter para double
		
		System.out.println(cpf+"\n"+pi);
	}

}
