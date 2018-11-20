package FilaGen;

public class FilaGen {

	private Celula primeira;
	private Celula ultima;
	private int length;

	FilaGen() {

		this.primeira = this.ultima = null;
		this.length = 0;
	}

	FilaGen(Object elemento) {

		this.primeira = this.ultima = new Celula(elemento);
		this.length = 1;

	}

	public void insere(Object elemento) {

		if (this.ultima != null) {

			Celula celulaAux = this.ultima;
			this.ultima = new Celula(elemento);
			celulaAux.setProximo(this.ultima);

		} else {

			this.primeira = this.ultima = new Celula(elemento);

		}

		this.length++;

	}

	public Object remove() {

		Object elemRemovido = null;

		if (this.length > 0) {
			elemRemovido = this.primeira.getElemento();
			this.primeira = this.primeira.getProximo();
			this.length--;
			if (this.length == 0) {
				this.ultima = null;
			}
		}

		return elemRemovido;

	}

	public String toString() {
		String saida = "";
		for (Celula atual = this.primeira; atual != null; atual = atual.getProximo()) {
			saida += atual.toString() + " ";
		}
		return saida;
	}

	public boolean vazia() {
		return (this.length == 0); // ou (this.primeira == null)
	}

	public int posicao(Object elemento) {
		// Retorna a posição do elemento na fila caso ele exista, iniciando na
		// posição 0
		// (zero)
		// Caso o elemento não exista na fila, retorna o valor -1
		int pos;
		if (this.length > 0) { // fila não está vazia
			Celula celAtual = this.primeira;
			for (pos = 0; pos < this.length && !celAtual.getElemento().equals(elemento); pos++) {
				celAtual = celAtual.getProximo();
			}
			if (pos < this.length) {
				return pos;
			}
		}
		return -1;
	}

	public Celula getPrimeira() {
		return primeira;
	}

	public void setPrimeira(Celula primeira) {
		this.primeira = primeira;
	}

	public Celula getUltima() {
		return ultima;
	}

	public void setUltima(Celula ultima) {
		this.ultima = ultima;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void organizarFila(FilaGen fila) {

		int count = fila.length; 
		int numAux1 = (int) fila.remove(); 
		int numAux2;

		PilhaGenericaIlim pilha1 = new PilhaGenericaIlim(numAux1);
		PilhaGenericaIlim pilha2 = new PilhaGenericaIlim();

		for (int i = 1; i < count; i++) {
			numAux2 = (int) fila.remove();
			if (numAux2 <= numAux1) {
				pilha1.empilha(numAux2);
			} else {
				while (!pilha1.vazia() && numAux2 > numAux1) {
					pilha2.empilha(pilha1.desempilha());
					if (!pilha1.vazia()) {
						numAux1 = (int) pilha1.getTopo().getElemento();
					}
				}
				pilha1.empilha(numAux2);
				while (pilha2.getTopo() != null) {
					pilha1.empilha(pilha2.desempilha());
				}

			}

			numAux1 = (int) pilha1.getTopo().getElemento();

		}
		while (!pilha1.vazia()) {
			fila.insere(pilha1.desempilha());
		}

	}
}
