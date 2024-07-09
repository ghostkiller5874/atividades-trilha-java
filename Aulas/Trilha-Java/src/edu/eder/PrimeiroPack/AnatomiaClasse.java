package edu.eder.PrimeiroPack;
/*
 * no package utiliza a seguinte estratura
 * seguimento.nome/nomeNegocio.nomeAplicacao
 * 
 * como por exemplo o pacote que esta sendo usado acima
 * edu = pq conta do curso, ser um estudo
 * eder = meu nome
 * primeiroPack = referenciando como se fosse um pack exemplo ou primeiro package
 * 
 * 
 * e pode ter tambem subfinalidades tipo: seguimento.nome/nomeNegocio.nomeAplicacao.model
 * 
 * legenda:
 * comercial == com
 * organizacional == org
 * opensource == org/opensource
 * 
 */
public class AnatomiaClasse {
	public static String setar(String nome,String sobrenome) {
		return nome +" "+ sobrenome;
	}
	
	
	public static void main(String [] args) {
		String nome = "Eder";
		String sobrenome = "Moreira de Oliveira";
		int idade = 25;
		
		String nomeCompleto = setar(nome, sobrenome);
		
		System.out.println(nomeCompleto + ", " + idade + " anos!");
		
	}
	
}


