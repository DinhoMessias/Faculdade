package ListaDupla;

public class LstEncDup {

	private Celula primeiroElem;
	private Celula ultimoElem;
	private static int length;

	public LstEncDup() { // construtor para lista vazia

		primeiroElem = null;
		ultimoElem = null;
		length = 0;

	}

	public LstEncDup(Object elemento) { // construtor para iniciar a lista com 1
										// elemento

		Celula aux = new Celula(elemento);
		this.primeiroElem = this.ultimoElem = aux;
		length = 1;

	}

	public int pesquisaElem(Object elemento) {
		Celula celulaAux = this.primeiroElem;
		int resp = 0;

		if (this.primeiroElem == null) {
			return -1;
		} else {

			while (!celulaAux.getElemento().equals(elemento) // percorre a lista
																// ate encontrar
																// o elemento
					&& celulaAux.getProximo() != null) { // ou ate a lista
															// acabar
				celulaAux = celulaAux.getProximo();
				resp++;
			}

			if (celulaAux.getElemento().equals(elemento)) { // verifico se o
															// elemento que esta
															// na celula
				return resp; // e igual ao objeto passado no parametro e retorno
								// sua posicao
			} else {
				return -1;
			}

		}

	}

	public Object getElementoPos(int pos) {

		Celula celulaAux = this.primeiroElem;
		Object resp = null;

		if (pos > length) {
			return resp;
		} else {

			for (int i = 0; i <= pos; i++) {
				celulaAux = celulaAux.getProximo();
			}

			resp = celulaAux.getElemento();
			return resp;
		}

	}

	public void insereInicio(Object elemento) {

		if (this.primeiroElem == null) {
			this.primeiroElem = new Celula(elemento);
		} else {
			Celula aux = new Celula(elemento);
			aux.setProximo(this.primeiroElem);
			this.primeiroElem.setAnterior(aux);
			this.primeiroElem = aux;
		}

		length++;
	}

	public void insereFinal(Object elemento) {

		if (this.ultimoElem == null) {
			this.ultimoElem = new Celula(elemento);
		} else {
			Celula aux = new Celula(elemento);
			aux.setAnterior(this.ultimoElem);
			this.ultimoElem.setProximo(aux);
			this.ultimoElem = aux;
		}

		length++;

	}

	public void inserePosicao(int pos, Object elemento) { // falta terminar de
															// implementar

		Celula celulaAux = this.primeiroElem, celulaAux2;

		if (pos <= length) {

			for (int i = 0; i < pos - 1; i++) {
				celulaAux = celulaAux.getProximo();
			}

			if (celulaAux.getElemento() == null) {
				celulaAux.setElemento(elemento);
			} else {
				celulaAux2 = new Celula(elemento);
			}

		}

	}

	public boolean excluirInicio() {

		if (this.primeiroElem == null) {
			return false;
		} else {

			Celula celulaAux = new Celula(this.primeiroElem);
			this.primeiroElem = celulaAux.getProximo();
			this.primeiroElem.setProximo(celulaAux.getProximo().getProximo());
			length--;
			return true;

		}

	}

	public boolean excluirFinal() {

		if (this.ultimoElem == null) {
			return false;
		} else {
			Celula celulaAux = new Celula(this.ultimoElem.getAnterior());
			celulaAux.setProximo(null);
			this.ultimoElem = celulaAux;
			length--;
			return true;

		}

	}

}
