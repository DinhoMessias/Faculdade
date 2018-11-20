package LstGenerica;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;

	Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String toString() {
		return String.format("Nome: %s\nIdade: %d\nSexo: %s", this.nome, this.idade, this.sexo);
	}

	public boolean equals(Pessoa p) {
		if (this.nome.equalsIgnoreCase(p.nome) && this.idade == p.idade && this.sexo.equalsIgnoreCase(p.sexo))
			return true;

		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
