package edu.eder.QuartoPack.ListaDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<String>();
		
		lista.add("c1");
		lista.add("c2");
		lista.add("c3");
		lista.add("c4");
		lista.add("c5");
		
		System.out.println(lista);
		/****************/
		
		lista.remove(3);
		System.out.println(lista);
		
		/*****************/
		lista.add(3, "99");
		System.out.println(lista);
	}

}
