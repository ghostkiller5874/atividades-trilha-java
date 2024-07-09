package edu.eder.PrimeiroPack;

public class Operadores {

	public static void main(String[] args) {
		int numero = 5;
		
		//negando o valor
		numero = -numero;
		System.out.println(numero);

		//tornando o valor positovo
		numero = numero * -1;//metodo para positvar um valor
		
		System.out.println(numero);
		
		//incrementar
		numero = numero + 2;//incrementa de 2 em 2
		numero++;//incrementar de 1 em 1, como se fosse numero+1
		//a mesma regra se aplica para decrementar
		
		//fazer dentro do print, tem regras
		System.out.println(numero++);// ele vai imprimir o numero e dps incrementar, ai precisaria de mais um print pra mostrar o valor incrementar
		System.out.println(numero);
		
		//para funcionar em apenas um print, deve incrementar antes
		System.out.println(++numero);
		// as mesmas regras se aplicam ao decrementar
		
		
		
		//negar / inverter, uma variavel boolean
		boolean var = true;
		
		System.out.println(!var);//inverte de modo temporario
		System.out.println(var);
		
		//para negar de forma permanente, teria de reatribuir
		var = !var;
		System.out.println(var);
		
		//para comparar conteudo(strings ...) recomenda-se utilizar equals()
		String nome1 = "Eder";
		//String nome2 = "Eder";
		String nome2 = new String("Eder");//apesar de ser o mesmo valor, da false. pq ele esta comparando o objeto e nao o valor, ai é recomendavel usar o equals
		//System.out.println(nome1 == nome2);
		System.out.println(nome1.equals(nome2));//mesmo sendo um objeto, o equals pega o valor do mesmo e faz a comparação. exatamente por ser um objeto
		
		
	}

}
