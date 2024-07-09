package edu.eder.QuartoPack.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Carro> queueCarro = new LinkedList<>();
		
		queueCarro.add(new Carro ("Ford"));
		queueCarro.add(new Carro ("Fiat"));
		queueCarro.add(new Carro ("Chevrolet"));
		
		System.out.println(queueCarro.add(new Carro("Peugeot")));
		System.out.println(queueCarro);
		
		System.out.println(queueCarro.offer(new Carro("Renault")));
		System.out.println(queueCarro);
		
		System.out.println(queueCarro.peek());// pega a cabeça da fila, caso tiver, se nao tiver return null
		System.out.println(queueCarro);
		
		System.out.println(queueCarro.isEmpty());
		
		System.out.println(queueCarro.size());
		
		System.out.println(queueCarro.poll());
		System.out.println(queueCarro);
		System.out.println(queueCarro.size());
		

	}

}
