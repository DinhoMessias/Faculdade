package FilaGen;

public class PilhaGenericaIlim {
	private Celula topo;
	private int length;

	PilhaGenericaIlim() {
		this.topo = null;
		this.length = 0;
	}

	PilhaGenericaIlim(Object elemento) {
		this.topo = new Celula(elemento);
		this.length = 1;
	}

	public void empilha(Object elemento) {
		this.topo = new Celula(elemento, this.topo);
		this.length++;
	}

	public Object desempilha() {
		Object elemDesempilhado = null;
		if (this.length > 0) { // ou (this.topo != null)
			elemDesempilhado = this.topo.getElemento();
			this.topo = topo.getProximo();
			this.length--;
		}
		return elemDesempilhado;
	}

	public boolean vazia() {
		return (this.length == 0); // ou (this.topo == null)
	}

	public int getLength() {
		return this.length;
	}

	public String toString() {
		String saida = "";
		Celula atual = this.topo;
		for (int i = 0; i < length; i++) {
			saida += atual.toString() + "\n\n";
			atual = atual.getProximo();
		}
		return saida;
	}

	public Celula getTopo() {
		return topo;
	}

	public void setTopo(Celula topo) {
		this.topo = topo;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
