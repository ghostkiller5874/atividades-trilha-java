package edu.eder.QuartoPack.Fila;

public class Fila<T> {

	/**
	 * para refatorar e embutir o 'no', ao inves de passar o "No"(objeto criado por nos) passaremos um Object e dps 
	 * vamos instanciar o "No"
	 * 
	 * 
	 * para refatorar como generics foi utilizado o " T "
	 */
	private No<T> refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	public void enqueue(T obj) {
		/**
		 * adiciona um novo 'no' para o final da fila
		 */
		No novoNo = new No(obj);
		novoNo.setRefNo(refNoEntradaFila);// vai apontar para o ultimo no
		refNoEntradaFila = novoNo;// agora o novo no passa a ser o ultimo da fila
	}
	
	public T first() {
		/*
		 * retorna o primeiro 'no' 
		*/
		if(!isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					// verifica se a referencia do 'no' é null, se for ele nao é o primeiro
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
				
			}
			return (T)primeiroNo.getObject();	
		}
		return null;
	}
	
	public T dequeue() {
		/*
		 * 
		 */
		No primeiroNo = refNoEntradaFila;
		No noAuxiliar = refNoEntradaFila;
		if(!isEmpty()) {
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}

		}
		return (T)primeiroNo.getObject();
		
	}
	
	public boolean isEmpty() {
		return refNoEntradaFila == null ? true : false;
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No{object= "+ noAuxiliar.getObject()+"}]--->";
				
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}else {
					stringRetorno += "null";// o primeiro aponta pra null
					break;
				}
			}
		}else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}
	
	
}
