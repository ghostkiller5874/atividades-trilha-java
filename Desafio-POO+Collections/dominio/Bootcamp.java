package edu.eder.QuartoPack.Desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome, descricao;
	private LocalDate dataInitial = LocalDate.now(), dataFim = dataInitial.plusDays(45);
	private Set<Dev> devInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInitial() {
		return dataInitial;
	}
	public void setDataInitial(LocalDate dataInitial) {
		this.dataInitial = dataInitial;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	public Set<Dev> getDevInscritos() {
		return devInscritos;
	}
	public void setDevInscritos(Set<Dev> devInscritos) {
		this.devInscritos = devInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFim, dataInitial, descricao, devInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFim, other.dataFim)
				&& Objects.equals(dataInitial, other.dataInitial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devInscritos, other.devInscritos) && Objects.equals(nome, other.nome);
	}
	
	
}
