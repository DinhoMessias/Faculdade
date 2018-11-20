package Pilha;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

	public static void carregaPessoa(String caminho, LstDuplaGenerica lista) {
		FileReader arquivo;
		BufferedReader leitor;
		String linha = "";
		try {
			arquivo = new FileReader(caminho);
			leitor = new BufferedReader(arquivo);
			while (leitor.ready()) {
				linha = leitor.readLine();
				String dados[] = linha.split(";");
				Pessoa p1 = new Pessoa(dados[0], Integer.parseInt(dados[1]), dados[2]);
				lista.InsereFinal(p1);
			}
			leitor.close();
			arquivo.close();

		} catch (IOException e) {
			System.out.println("Erro na abertura do arquivo!");

		}
	}

	public static void SalvaArquivo(String caminho, String texto) throws IOException {
		// Salva e sobrescreve (sem append)
		FileWriter arquivo = new FileWriter(caminho);
		BufferedWriter writer = new BufferedWriter(arquivo);

		writer.write(texto);
		writer.close();
		arquivo.close();
	}

}
