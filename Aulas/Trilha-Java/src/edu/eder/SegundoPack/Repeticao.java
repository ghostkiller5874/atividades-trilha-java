package edu.eder.SegundoPack;

public class Repeticao {

	public static void main(String[] args) {
		// foreach
		
		String nomes[] = {"Eder", "Moreira","Oliveira"};
		/*
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Nome: "+nomes[i]);
		}*/
		for (String nome : nomes) {
			System.out.println("Nome: "+nome);
		}
		
	}


}
