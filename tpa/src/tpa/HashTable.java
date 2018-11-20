package tpa;

public class HashTable {
	private int lin, col;
	private Contato[][] tab;

	// Utilizaremos o campo 'nome' de Contato para insercao de registros,
	// neste exemplo poderemos colocar nomes "parecidos", p.ex. Maria e Maira

	public HashTable(int lin, int col) {
		this.lin = lin;
		this.col = col;
		tab = new Contato[lin][col];
	}

	public boolean insereContato(Contato elem) {

		int colisoes = 0;
		int pos = hashFunc(elem.getNome());

		while (colisoes < col && tab[pos][colisoes] != null)

			colisoes++;

		if (tab[pos][colisoes] == null)
			tab[pos][colisoes] = elem;
		else
			return false;

		return true;
	}

	public Contato pesquisaContato(String chave) {
		int pos = hashFunc(chave);
		Contato c1 = null;
		boolean encontrado = false;

		for (int i = 0; !encontrado && i < tab.length; i++) {
			if (tab[pos][i].getNome().equalsIgnoreCase(chave))
				c1 = tab[pos][i];
			encontrado = true;
		}
		return c1;
	}

	public Contato excluiContato(String chave) {
		int pos = hashFunc(chave);
		Contato elem = null;

		for (int i = 0; i < tab.length; i++)

			if (elem == null) {

				if (tab[pos][i].getNome().equalsIgnoreCase(chave)) {
					elem = tab[pos][i];
					tab[pos][i] = null;
				} else {
					tab[pos][i - 1] = tab[pos][i];
				}
			}

		return elem;
	}

	// Esta funcao recebe uma String e retorna valores entre 0 e tam-1
	public int hashFunc(String nome) {
		int soma = 0;

		for (int ind = 0; ind < nome.length(); ind++) {
			// para obter o codigo UNICODE de um char, basta fazer um casting
			// explcito para
			// int
			soma += (int) nome.charAt(ind); // charAt retorna o char que est na
											// posio ind do nome
		}
		return soma % lin;
	}
}