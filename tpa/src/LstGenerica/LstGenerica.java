package LstGenerica;

public class LstGenerica {

	private Celula PrimeiroElem;
	private Celula UltimoElem;
	private static int Length;

	public LstGenerica() { // construtor lst vazia

		this.PrimeiroElem = null;
		this.UltimoElem = null;
		Length = 0;

	}

	public LstGenerica(Object elemento) { // construtor para iniciar a lista com
											// o 1 elemento

		Celula aux = new Celula(elemento);
		this.PrimeiroElem = UltimoElem = aux;
		Length = 1;

	}

	public void insereInicio(Object elemento) {

		if (this.PrimeiroElem == null) { // verificando se a primeira posicao
											// esta vazia
			this.PrimeiroElem = new Celula(elemento);
		} else { // caso primeiro elemento esteja ocupado
			Celula aux = new Celula(elemento);
			aux.setProximo(this.PrimeiroElem);
			this.PrimeiroElem = aux;

		}

		Length++;

	}

	public void insereFim(Object elemento) {

		if (this.UltimoElem == null) { // se ultima posicao estiver vazia ja
										// coloca o objeto nela
			this.UltimoElem = new Celula(elemento);
		} else { // caso ultima posicao esteja ocupada
			Celula aux = new Celula(elemento);
			this.UltimoElem.setProximo(aux);
			this.UltimoElem = aux;

		}

		Length++;

	}

	public void inserePosicao(Object elemento, int pos) {
		Celula celulaAux = new Celula(this.PrimeiroElem), celulaAux2;

		if (pos <= Length) { // verificando se a posicao e valida
			for (int i = 0; i < pos - 1; i++) { // percorrendo a lista ate a
												// posicao
				celulaAux = celulaAux.getProximo();
			}

			if (celulaAux.getElemento() == null) { // se o elemento estiver vazio
												// na posicao
				celulaAux.setElemento(elemento);
			} else {
				celulaAux2 = new Celula(elemento);
				celulaAux2.setProximo(celulaAux.getProximo());
				celulaAux.setProximo(celulaAux2);
			}

			Length++;

		}

	}

	public boolean excluirInicio() {

		if (this.PrimeiroElem == null) {
			return false;
		} else {

			Celula celulaAux = new Celula(this.PrimeiroElem);
			this.PrimeiroElem = celulaAux.getProximo();
			Length--;
			return true;

		}

	}

	public boolean excluir(Object elemento) {
		Celula celulaAux1 = this.PrimeiroElem;
		Celula celulaAux2 = null;

		/*
		 * celula auxiliar 2 recebe o objeto anterior do excluido, enquanto a
		 * celula auxiliar 1 percorre a lista ate o objeto a ser excluido
		 */

		if (this.PrimeiroElem == null) {
			return false;
		} else {
			while (!celulaAux1.getElemento().equals(elemento) && celulaAux1.getProximo() != null) {
				celulaAux2 = celulaAux1;
				celulaAux1 = celulaAux1.getProximo();
			}
			if (celulaAux1.getElemento().equals(elemento)) {
				if (celulaAux1 == this.PrimeiroElem) {
					this.PrimeiroElem = this.PrimeiroElem.getProximo();
					if (this.PrimeiroElem == null) { // Se foi excluído o
														// primeiro e único
														// elemento
						this.UltimoElem = null;
					}
				} else {
					celulaAux2.setProximo(celulaAux1.getProximo());
					if (celulaAux2.getProximo() == null) { // Se foi excluído o
															// último elemento
						this.UltimoElem = celulaAux2;
					}
				}
			}
			Length--;
			return true;
		}
	}

	public boolean excluirFim() {

		Celula celulaAux1 = this.PrimeiroElem;
		Celula celulaAux2 = null;

		/*
		 * celula auxiliar 2 recebe o objeto anterior do excluido, enquanto a
		 * celula auxiliar 1 percorre a lista ate o objeto a ser excluido
		 */

		if (this.UltimoElem == null) {
			return false;
		} else {
			while (celulaAux1 != this.UltimoElem) {
				celulaAux2 = celulaAux1;
				celulaAux1 = celulaAux1.getProximo();
			}

			celulaAux2.setProximo(null);
			this.UltimoElem = celulaAux2;
			Length--;
			return true;
		}

	}

	public int pesquisa(Object elemento) {
		Celula celulaAux1 = this.PrimeiroElem;
		int resp = 0;

		if (this.PrimeiroElem == null) { // se lista estiver vazia
			return -1;
		} else { // percorrendo a lista ate o elemento
			while (!celulaAux1.getElemento().equals(elemento) && celulaAux1.getProximo() != null) {
				celulaAux1 = celulaAux1.getProximo();
				resp++;
			}
			if (celulaAux1.getElemento().equals(elemento)) {
				return resp;
			} else {
				return -1;
			}

		}

	}

	public String toString() {
		String result = "";
		Celula celulaAux = this.PrimeiroElem;

		if (celulaAux.getElemento() == null) {
			result += "Lista vazia";
		} else {
			while (celulaAux != null) {
				result += "\n" + celulaAux.getElemento().toString();
				celulaAux = celulaAux.getProximo();
			}
		}
		return result;
	}

}