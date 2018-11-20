package FilaGen;



import java.util.Scanner;
public class Util {
	public static String leString(String frase){
		Scanner entrada = new Scanner(System.in);
		System.out.print(frase);
		String texto = entrada.nextLine();
		return texto;
	}
	public static int validaIntervalo(String frase, int min, int max){
		boolean cond = false;
		int num = 0;
		do{
			num = leInt(frase);
			if(num<min || num>max){
				System.out.print("ERRO: Informe um valor entre "+min+" e "+max+"!\n");
			}else{
				cond = true;
			}
		}while(!cond);
		return num;
	}
	public static double validaPositivoD(String frase){
		boolean cond = false;
		double num = 0;
		do{
			num = leDouble(frase);
			if(num<0){
				System.out.print("ERRO: Informe um valor positivo!\n");
			}else{
				cond = true;
			}
		}while(!cond);
		return num;
	}
	public static int validaPositivo(String frase){
		boolean cond = false;
		int num = 0;
		do{
			num = leInt(frase);
			if(num<0){
				System.out.print("ERRO: Informe um valor positivo!\n");
			}else{
				cond = true;
			}
		}while(!cond);
		return num;
	}
	public static int leInt(String frase){
		Scanner entrada = new Scanner(System.in);	
		boolean cond = false;
		int num = 0;
		do{
			System.out.print(frase);
			String texto = entrada.nextLine();
			try{
				num = Integer.parseInt(texto); 
				cond = true;
			}catch(Exception e){
				System.out.print("ERRO: Informe um valor númerico!\n");
			}
		}while(!cond);
		return num;
	}
	public static double leDouble(String frase){
		Scanner entrada = new Scanner(System.in);	
		boolean cond = false;
		double num = 0;
		do{
			System.out.print(frase);
			String texto = entrada.nextLine();
			try{
				num = Double.parseDouble(texto); 
				cond = true;
			}catch(Exception e){
				System.out.print("ERRO: Informe um valor númerico!\n");
			}
		}while(!cond);
		return num;
	}
	public static void limpaTela(){
		for(int i=0;i<150;i++){
			System.out.print("\n");
		}	
	}
	public static void pressQT(){
		Scanner entrada = new Scanner(System.in);
		System.out.print("\n\nPressione Enter para voltar ao Menu...");
		entrada.nextLine();
	}
}
