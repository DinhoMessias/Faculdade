package LstGenerica;

public class Celula {

	private Object Elemento;
	private Celula Proximo;

	public Celula() {

		this.Elemento = null;
		this.Proximo = null;

	}

	public Celula(Object elemento) {

		this.Elemento = elemento;
		this.Proximo = null;

	}

	public Celula(Object elemento, Celula proximo) {

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
