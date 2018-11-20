package ListaDupla;

public class Celula {
	private Celula proximo;
	private Celula anterior;
	private Object elemento;

	public Celula(Object elemento) { // construtor feito para iniciar a lista

		this.elemento = elemento;
		this.anterior = this.proximo = null;
	}

	public Celula(Object elemento, Celula anterior, Celula proximo) {

		this.elemento = elemento;
		this.anterior = anterior;
		this.proximo = proximo;

	}


	public Celula getProximo() {
		return proximo;
	}


	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}


	public Celula getAnterior() {
		return anterior;
	}


	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}


	public Object getElemento() {
		return elemento;
	}


	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

}
