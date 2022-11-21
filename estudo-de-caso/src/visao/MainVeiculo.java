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
					         + "║  ┆0┆ SAIR    ║\n"
					         + "║ ❶ CADASTRAR  ║\n"
					         + "║  ❷ ALTERAR   ║\n"
					         + "║  ❸ EXCLUIR   ║\n"
					         + "║   𝟰 LISTAR   ║\n"
					         + "╚══════════════╝\n");
			

			opcaoEscolhida = Integer.valueOf(ler.nextLine());
			
			switch (opcaoEscolhida) {
			case 0: {
				break;
			}
			case 1: {
				Veiculo veiculo = new Veiculo();
				
			}
			default:
			}
		}
		
		
		
	}
}
