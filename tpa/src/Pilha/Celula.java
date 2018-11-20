package Pilha;

public class Celula {

	private Object Elemento;
	private Celula Proximo;

	public Celula() { //construtor celula vazia

		this.Elemento = null;
		this.Proximo = null;

	}

	public Celula(Object elemento) { //construtor celula simples

		this.Elemento = elemento;
		this.Proximo = null;

	}

	public Celula(Object elemento, Celula proximo) { //construtor celula meio pilha

		this.Elemento = elemento;
		this.Proximo = proximo;

	}

	public Object getElemento() {
		return Elemento;
	}

	public void setElemento(Object elemento) {
		Elemento = elemento;
	}

	public Celula getProximo() {
		return Proximo;
	}

	public void setProximo(Celula proximo) {
		Proximo = proximo;
	}

}
