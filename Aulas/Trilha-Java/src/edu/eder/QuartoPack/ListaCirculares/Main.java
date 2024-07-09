package edu.eder.QuartoPack.ListaCirculares;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaCircular<String> circular = new ListaCircular<>();
		
		circular.add("c0");
		circular.add("c1");
		circular.add("c2");
		circular.add("c3");
		
		System.out.println(circular);
		
		//System.out.println(circular.get(0));
		
		for(int i = 0; i < 10;i++) {
			System.out.println(circular.get(i));
		}

	}

}
