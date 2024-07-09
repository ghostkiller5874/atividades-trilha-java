package edu.eder.QuartoPack.No;

public class No<T> {
	/**
	 * conceito de lista encadeada, com no
	 * 
	 * 
	 * 
	 * foi refatorado usando generics ( <T> = tipo generico )   
	 */
	private T conteudo;
	private No<T> proximoNo;
	
	public No(T conteudo) {
		
		this.conteudo = conteudo;
		this.proximoNo = null;
	}
	
	public T getConteudo() {
		return conteudo;
	}
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	public No<T> getProximoNo() {
		return proximoNo;
	}
	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "No [conteudo = " + conteudo + "]";
	}
	
	
}
