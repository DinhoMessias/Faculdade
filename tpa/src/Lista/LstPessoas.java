package Lista;

public class LstPessoas {
	private Pessoa elemento;
	private LstPessoas sucessor;
	private static int length;

	public LstPessoas() {
		this.elemento = null;
		this.sucessor = null;
		length = 0;
	}

	public LstPessoas(Pessoa _pessoa) {
		this.elemento = _pessoa;
		this.sucessor = null;
		length = 1;
	}

	public int getLength() {
		return length;
	}

	public void insereInicio(Pessoa objPessoa) {
		LstPessoas lstAux;
		if (this.elemento == null) {
			// se a lista estiver vazia
			this.elemento = objPessoa;
		} else {
			// se a lista não estiver vazia
			lstAux = new LstPessoas(this.elemento);
			lstAux.sucessor = this.sucessor;
			this.elemento = objPessoa;
			this.sucessor = lstAux;
		}
		length++;
	}

	public void insereFim(Pessoa objPessoa) {
		LstPessoas lstAux1, lstAux2;
		if (this.elemento == null) {
			// se a lista estiver vazia
			this.elemento = objPessoa;
		} else {
			// se a lista não estiver vazia
			lstAux1 = this;
			while (lstAux1.sucessor != null) {
				lstAux1 = lstAux1.sucessor;
			}
			lstAux2 = new LstPessoas(objPessoa);
			lstAux1.sucessor = lstAux2;
		}
		length++;

	}

	public boolean inserePosicao(Pessoa objPessoa, int posicao) {
		// considera o primeiro elemento na posição 0 (zero)
		LstPessoas lstAux1 = this, lstAux2;

		if (posicao <= length) {
			if (this.elemento == null) { // ou poderia verificar condição
											// this.length == 0
				// se a lista estiver vazia
				this.elemento = objPessoa;
			} else {
				for (int i = 0; i < posicao - 1; i++) {
					lstAux1 = lstAux1.sucessor;
				}
				lstAux2 = new LstPessoas(objPessoa);
				lstAux2.sucessor = lstAux1.sucessor;
				lstAux1.sucessor = lstAux2;
			}
			length++;
			return true;
		}
		return false;
	}

	public boolean excluir(Pessoa objPessoa) {
		LstPessoas lstAux1 = this;
		LstPessoas lstAux2 = null;

		/*
		 * lista auxiliar 2 recebe o objeto anterior do excluido, enquanto a
		 * lista auxiliar 1 percorre a lista ate o objeto a ser excluido
		 */
		if (this.elemento == null) {
			return false;
		} else {
			while (!lstAux1.elemento.equals(objPessoa) && lstAux1.sucessor != null) {
				lstAux2 = this;
				lstAux1 = lstAux1.sucessor;
			}
			if (lstAux1.elemento.equals(objPessoa)) {
				if (lstAux1 != this) {
					lstAux2.sucessor = lstAux1.sucessor;
				} else {
					if (lstAux2.sucessor != null) {
						lstAux1.elemento = lstAux2.sucessor.elemento;
						lstAux1.sucessor = lstAux2.sucessor.sucessor;
					} else {
						lstAux1.elemento = null;
					}
				}
				length--;
				return true;
			}
		}
		return false;
	}

	public boolean excluirRecursivo(Pessoa objPessoa) {
		boolean excluido = false;
		if (this.elemento == null) {
			return excluido;
		} else {
			if (!this.elemento.equals(objPessoa)) {
				if (this.sucessor != null) {
					excluido = this.sucessor.excluirRecursivo(objPessoa);
					if (excluido == true && this.sucessor.elemento == null) {
						this.sucessor = null;
					}

				} else {
					return excluido;
				}
			}
			if (this.sucessor != null) {
				this.elemento = this.sucessor.elemento;
				this.sucessor = this.sucessor.sucessor;
			} else {
				this.elemento = null;
			}
			length--;
			return true;
		}

	}

	public Pessoa pesquisa(String nome) {
		LstPessoas lstAux = this;
		Pessoa p1 = null;

		while (!lstAux.elemento.getNome().equalsIgnoreCase(nome)) {
			lstAux = lstAux.sucessor;
		}
		p1 = lstAux.elemento;
		return p1;
	}

	public boolean pesquisa(Pessoa objPessoa) {
		LstPessoas lstAux = this;

		if (this.elemento == null) { // caso lista esteja vazia
			return false;
		} else {

			while (!lstAux.elemento.equals(objPessoa)) {
				lstAux = lstAux.sucessor;
			}
			return true;
		}
	}

	public void insereFimRecursivo(Pessoa objPessoa) {

		if (this.elemento == null) { // caso a lista esteja vazia
			this.elemento = objPessoa;
		} else {
			if (this.sucessor == null) { // lista com somente um elemento
				LstPessoas lstAux = new LstPessoas(objPessoa);
				this.sucessor = lstAux;
			} else { // percorre lista ate encontrar ultimo elemento
				this.sucessor.insereFimRecursivo(objPessoa);
			}

		}

	}

	public String toString() {
		String result = "";
		LstPessoas lstAux = this;

		if (this.elemento == null) {
			result += "Lista vazia";
		} else {
			while (lstAux != null) {
				result += "\n" + lstAux.elemento.toString();
				lstAux = lstAux.sucessor;
			}
		}
		return result;
	}

}
