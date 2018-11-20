package Pilha;

public class Pilha {

	private Celula topoPilha;
	private int length;

	public Pilha() {
		this.topoPilha = null;
		this.length = 0;
	}

	public Pilha(Object elemento) {
		this.topoPilha = new Celula(elemento);
		this.length = 1;
	}

	public void adicionarTopo(Object elemento) {
		Celula celAux = new Celula(elemento, this.topoPilha);
		this.topoPilha = celAux;
		this.length++;
	}

	public Object desempilha() {

		if (this.length > 0) {

			Celula retirada = this.topoPilha;
			this.topoPilha = topoPilha.getProximo();
			t
			
			
		}

	}

}
