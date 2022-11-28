package visao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Veiculo;

public class MainVeiculo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer opcaoEscolhida = Integer.MAX_VALUE;
		ArrayList<Veiculo>listaVeiculos = new ArrayList<Veiculo>();
		
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
				
				listaVeiculos.add(veiculo);
				//Vitor
			}
			case 2: {
				limparConsole();
				Veiculo veiculo = new Veiculo();
				//Vitor
			}
			case 3: {
				limparConsole();
				Veiculo veiculo = new Veiculo();
				
				//Barbara
			}
			case 4: {
				limparConsole();
				Veiculo veiculo = new Veiculo();
				//Barbara
			}
			default:
				break;
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
