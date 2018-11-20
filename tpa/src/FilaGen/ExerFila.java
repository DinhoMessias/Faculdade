package FilaGen;

public class ExerFila {
	public static void main(String[] args) {

		FilaGen fila = null;
		int min, max, op, subMenu;
		Integer num;
		boolean continua_menu = true, continua_submenu = true;
		String result;

		do {

			try {

				op = Util.validaIntervalo("Digite a opção desejada: \n\n" + "1 - Iniciar/Gerenciar Fila\n"
						+ "2 - Exibir Fila\n" + "3 - Organizar Fila\n\n" + "0 - Sair\n", 0, 3);
				switch (op) {
				case 1:

					do {

						subMenu = Util
								.validaPositivo("Digite a opção desejada: \n\n" + "1 - Iniciar Fila Escolhendo Numero\n"
										+ "2 - Iniciar Fila Numero Aleatorio\n" + "3 - Adicionar Numero Aleatorio\n"
										+ "4 - Adicionar Numero Especifico\n\n" + "0 - Retornar ao menu anterior\n");

						switch (subMenu) {
						case 1:
							num = Util.validaPositivo("Informe o numero desejado");
							fila = new FilaGen(num);
							break;
						case 2:
							min = Util.validaPositivo("Informe o valor minimo para o numero:");
							max = Util.validaPositivo("Informe o valor maximo para o numero: ");
							num = min + (int) (Math.random() * ((max - min) + 1));
							fila = new FilaGen(num);
							break;

						case 3:
							min = Util.validaPositivo("Informe o valor minimo para o numero:");
							max = Util.validaPositivo("Informe o valor maximo para o numero: ");
							num = min + (int) (Math.random() * ((max - min) + 1));
							fila.insere(num);
							break;
						case 4:
							num = Util.validaPositivo("Informe o numero desejado");
							fila.insere(num);
							break;

						case 0:

							continua_submenu = false;

							break;
						default:
							break;
						}

					} while (continua_submenu);

					break;

				case 2:

					System.out.println(result = fila.toString());

					break;
				case 3:

					fila.organizarFila(fila);

					break;
				case 0:

					continua_menu = false;
					System.out.println("Programa encerrado por comando do usuário");

					break;

				default:
					break;
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (continua_menu);

	}

}
