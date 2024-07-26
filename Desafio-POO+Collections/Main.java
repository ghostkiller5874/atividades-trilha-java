package edu.eder.QuartoPack.Desafio;

import java.time.LocalDate;

import edu.eder.QuartoPack.Desafio.dominio.Bootcamp;
import edu.eder.QuartoPack.Desafio.dominio.Curso;
import edu.eder.QuartoPack.Desafio.dominio.Dev;
import edu.eder.QuartoPack.Desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso(null, null, null);
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descricao curso java");
		curso.setCargaHoraria(8);

		Mentoria mentoria = new Mentoria(null, null, null);
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descricao mentoria Java");
		mentoria.setData(LocalDate.now());
		
		//Conteudo conteudo = new Curso(null, null, null);
		// poderia criar o "curso" a partir do conteudo, porem nao o inverso, pois o curso é filho
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		//
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("Eder M");
		
		dev.inscreverBootcamp(bootcamp);
		System.out.println(dev.getConteudoInscritos());
		
		dev.progredir();
		System.out.println(dev.getConteudoInscritos());
		
		System.out.println("XP: "+dev.calcularTotalXp());
		dev.progredir();
		System.out.println(dev.getConteudoInscritos());
		System.out.println("XP: "+dev.calcularTotalXp());
		
	}

}
