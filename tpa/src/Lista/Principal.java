package Lista;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menu = 0;
		int aux;

		do {
			System.out.println("1 - Criar Lista");
			System.out.println("2 - Inserir Pessoa");
			System.out.println("3 - Pesquisar Pessoa");
			System.out.println("4 - Remover Pessoa");
			System.out.println("5 - Sair");
			menu = entrada.nextInt();
			switch (menu) {
			case 1:
				System.out.println("1 - Criar Lista Vazia");
				System.out.println("2 - Criar Lista Com 1 Elemento");
				System.out.println("3 - Criar Lista Importando Elementos");

				break;

			default:
				break;
			}

		} while (menu != 5);

	}

}
