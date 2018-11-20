package FilaGen;

public class Celula {
	private Celula proximo;
	private Object elemento;

	Celula(Object elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}

	Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public Celula getProximo() {
		return this.proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Object getElemento() {
		return this.elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public String toString() {
		return this.elemento.toString();
	}

}