package visao;

import java.util.Scanner;

import model.Veiculo;

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
}
