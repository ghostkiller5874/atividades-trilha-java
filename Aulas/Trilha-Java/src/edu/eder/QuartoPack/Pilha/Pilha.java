package edu.eder.QuartoPack.Pilha;

public class Pilha {
	// no caso aqui é no
	private No refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public No top() {
		/**
		 * metodo top ele mostra/retorna a referencia do 'no' na pilha
		 */
		return refNoEntradaPilha;
	}
	
	public void push(No novoNo) {
		/**
		 * ele acresenta o 'no' na pilha, ele "empilha"
		 ***/

		No refAuxiliar = refNoEntradaPilha;// ele guarda a referencia de topo
		refNoEntradaPilha = novoNo; /* pega a referencia de topo e seta um novo no, ou seja,
		 a nova referencia sera dada para o no q acabou de empilhar*/
		refNoEntradaPilha.setRefNo(refAuxiliar);// e esse novo 'no' agora sera o topo, e q a antiga está abaixo agora
	}
	
	public No pop() {
		/**
		 * ele retira o 'no' da pilha, no caso o ultimo adicionado
		 */
		if(!this.isEmpty()) {
			/**
			 * se a pilha nao estiver vazia
			 */
			No noPoped = refNoEntradaPilha;// guarda o no que esta sendo retirado
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();// e pega o no q esta abaixo como nova referencia
			return noPoped;
		}
		return null;
	}
	
	
	
	public boolean isEmpty() {
		/*if(refNoEntradaPilha == null) {
			return true;
		}else {
			return false;
		}*/
		
		return refNoEntradaPilha == null ? true : false;
	}
	
	@Override
	public String toString() {
		String stringRetorno = "------------------\n";
		stringRetorno+= "    Pilha\n";
		stringRetorno+= "------------------\n";
	
		No noAuxiliar = refNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado="+ noAuxiliar.getDado()+"}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
		}
		stringRetorno+= "==================\n";
		return stringRetorno;
	}
	
}
