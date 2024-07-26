package edu.eder.QuartoPack.Desafio.dominio;

public class Curso extends Conteudo {
	
	private Integer cargaHoraria;
	
	
	
	public Curso(String titulo, String descricao, Integer cargaHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}


	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
		// como mostrado de exemplo, utiliza o "get" para puxar a variavel caso ela fosse 'private' na classe pai
	}



	public Double calcularXp() {
		return XP_PADRAO * cargaHoraria;
		
	}
}
