package tpa;

public class exerMatHash {

	public static void main(String[] args) {

		int op = 0;
		int lin = 10;
		int col = 5;
		HashTable tab = new HashTable(lin, col);
		Contato c1 = new Contato("Dinho", "1234-5678");
		Contato c2 = new Contato("Mariah", "1234-5678");
		Contato c3 = new Contato("Mahria", "1234-5678");
		Contato c4 = new Contato("iDhno", "1234-5678");
		Contato c5 = new Contato("Donih", "1234-5678");
		Contato c6 = new Contato("Donhi", "1234-5678");

		tab.insereContato(c1);
		tab.insereContato(c2);
		tab.insereContato(c3);
		tab.insereContato(c4);
		tab.insereContato(c5);
		tab.insereContato(c6);


		
		
	}

}
