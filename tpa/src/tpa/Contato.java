package tpa;
public class Contato {
	private String nome;
	private String telefone;

	public Contato(String _nome, String _tel) {
		this.nome = _nome;
		this.telefone = _tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String _telefone) {
		this.telefone = _telefone;
	}

	public boolean equals(Contato _contato) {
		if (nome.equalsIgnoreCase(_contato.nome) && telefone.equalsIgnoreCase(_contato.telefone))
			return true;

		return false;
	}

	public boolean equals(String _nome) {
		if (nome.equalsIgnoreCase(_nome))
			return true;

		return false;
	}
}