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
				Integer opcao;
				Boolean encontrou = false;
				Integer id;
				
				while (true)
				{
					System.out.println("╔════════════════════════╗\n");
					System.out.println("║  ID    MARCA    MODELO ║\n");
					
					for (Veiculo v : listaVeiculos) {
						System.out.println("║ " + v.getId() + v.getModelo() + " ║\n");
					}
					System.out.println("╚══════════════╝\n");
					
					System.out.println("Informe o id do veiculo para excluir: ");
					id = Integer.valueOf(ler.nextLine());
					
					if(id.equals(0))
					{
						System.out.println("Você saiu");
						break;
					}
					
					for (Veiculo v : listaVeiculos) {
						if(id.equals(v.getId()))
						{
							encontrou = true;
							listaVeiculos.remove(v);
							System.out.println("Operação feita com sucesso");
							break
						}
					}
					
					if(encontrou == false) 
					{
						System.out.println("Codigo informado nao existe");
					}
					
					
				}
				
				
				
				
				
				//Barbara
			}
			case 4: {
				limparConsole();
				Veiculo veiculo = new Veiculo();
				System.out.println("╔════════════════════════╗\n");
				System.out.println("║   LISTA DE VEICULOS    ║\n");
				for (Veiculo v : listaVeiculos) {
					System.out.println("║ Marca: " + v.getMarca() + " ║\n"
									 + "║ Modelo: " + v.getModelo() + " ║\n"
									 + "║ Ano fabricação: " + v.getAnoFabricação() + " ║\n"
									 + "║ Pneus: " + v.getQtdPneu() + " ║\n"
									 + "║ Cor: " + v.getCor() + " ║\n"
									 + "║ Placa: " + v.getPlaca() + " ║\n"
									 + "║ Total donos: " + v.getTotalDonos() + " ║\n"
									 + "║ KM rodados: " + v.getKmRodados() + " ║\n"
									 + "║ Tipo automovel: " + v.getTipoAutomovel() + " ║\n"
									 + "║ Tipo combustivel: " + v.getTipoCombustivel() + " ║\n");
				}
				System.out.println("╚══════════════╝\n");
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
