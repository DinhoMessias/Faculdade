package FilaGen;

public class Pessoa {

	private String Nome;
	private int Idade;
	private String Sexo;

	public Pessoa(String _nome, int _idade, String _sexo) {
		this.Nome = _nome;
		this.Idade = _idade;
		this.Sexo = _sexo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public boolean equals(Pessoa p1) {
		boolean igual = false;
		if (this.Nome == p1.Nome && this.Idade == p1.Idade && this.Sexo == p1.Sexo) {

			igual = true;

		}

		return igual;

	}

}
