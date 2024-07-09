package edu.eder.QuartoPack.No;

public class Main {

	public static void main(String[] args) {
		No<String> no1 = new No<>("no1");
		No<String> no2 = new No<>("no2");
		no1.setProximoNo(no2);
		No<String> no3 = new No<>("no3");
		no2.setProximoNo(no3);
		No<String> no4 = new No<>("no4");
		no3.setProximoNo(no4);
		
		//no1 -> no2 -> no3 -> no4 -> null
		
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());

	}

}
