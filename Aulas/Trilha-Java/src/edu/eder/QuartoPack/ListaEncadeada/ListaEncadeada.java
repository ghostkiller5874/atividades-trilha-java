package edu.eder.QuartoPack.ListaEncadeada;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAuxiliar = referenciaEntrada;
		
		for(int i = 0; i < this.size() - 1;i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		noAuxiliar.setProximoNo(novoNo);
	}
	
	public T remove(int index) {
		No<T> noPivor = this.getNo(index);
		if(index ==0 ) {
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}
		
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index){
		
		validaIndice(index);
		
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for(int i = 0; i <= index;i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;
	}
	
	public int size() {
		int tamanhoLista = 0;
		
		No<T> refereniaAux = referenciaEntrada;
		
		while(true) {
			if(refereniaAux != null) {
				tamanhoLista++;
				if(refereniaAux.getProximoNo() != null) {
					refereniaAux = refereniaAux.getProximoNo();
				}else {break;}
			}else {break;}
		}

		return tamanhoLista;
	}
	private void validaIndice(int index) {
		if(index >= size()) {
			int ultimoIndice = size()-1;
			throw new IndexOutOfBoundsException("Não existe conteudo no indice "+index+" desta lista. Esta lista só vai até o indice "+ultimoIndice+".");
		}
	}
	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}
	
	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		
		for(int i = 0; i < this.size();i++) {
			strRetorno += "No{conteudo= "+noAuxiliar.getConteudo()+" } --->";
			noAuxiliar = noAuxiliar.getProximoNo();  		
		}
		strRetorno += "null";
	
		return strRetorno;
	}
	
}
