package visao;

import java.io.IOException;
import java.util.Scanner;

import modelo.Veiculo;

public class MainVeiculo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer opcaoEscolhida = Integer.MAX_VALUE;
		
		while(opcaoEscolhida != 0) {
			System.out.println("╔══════════════╗\n"
					         + "║ MENU EXEMPLO ║\n"
					         + "║ ┆0┆ SAIR     ║\n"
					         + "║ ┆1┆ CADASTRAR║\n"
					         + "║ ┆2┆ ALTERAR  ║\n"
					         + "║ ┆3┆ EXCLUIR  ║\n"
					         + "║ ┆4┆ LISTAR   ║\n"
					         + "╚══════════════╝\n");
			
			System.out.print("Selecione uma opção acima: ");
			opcaoEscolhida = Integer.valueOf(ler.nextLine());
			
			switch (opcaoEscolhida) {
			case 0: {
				break;
			}
			case 1: {
				limparConsole();
				Veiculo veiculo = new Veiculo();
			}
			case 2: {
				
			}
			case 3: {
				
			}
			case 4: {
				
			}
			default:
			}
		}
		
		
		
	}
	
	public static void limparConsole()
	{
		Scanner scanner = new Scanner(System.in);
        String texto = scanner.next();

        //Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
			try {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} catch (InterruptedException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else
			try {
				Runtime.getRuntime().exec("clear");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
