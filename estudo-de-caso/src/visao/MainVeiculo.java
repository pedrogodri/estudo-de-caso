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
			System.out.println("╔════════════════╗\n"
					         + "║ MENU PRINCIPAL ║\n"
					         + "║ ┆0┆ SAIR       ║\n"
					         + "║ ┆1┆ CADASTRAR  ║\n"
					         + "║ ┆2┆ ALTERAR    ║\n"
					         + "║ ┆3┆ EXCLUIR    ║\n"
					         + "║ ┆4┆ LISTAR     ║\n"
					         + "╚════════════════╝\n");
			
			System.out.print("Selecione uma opção acima: ");
			opcaoEscolhida = Integer.valueOf(ler.nextLine());
			
			switch (opcaoEscolhida) {
			case 0: {
				break;
			}
			case 1: {
				limparConsole();
				Veiculo veiculo = new Veiculo();
				
				System.out.println("╔════════════════════════════════════════════════╗\n"
						          +"║ NECESSITAMOS DE ALGUMAS INFORMAÇÕES DO VEÍCULO ║\n"
				                  +"╚════════════════════════════════════════════════╝\n");
				System.out.println("-> MARCA(Ex:. Fiat): ");
				veiculo.setMarca(ler.nextLine());
				
				System.out.println("-> MODELO(Ex:. Argo): ");
				veiculo.setModelo(ler.nextLine());
				
				System.out.println("-> ANO DE FABRICAÇÃO(Ex:. 2022): ");
				veiculo.setAnoFabricacao(ler.nextInt());
				
				System.out.println("-> QUANTIDADE DE PNEU(Ex:. 4): ");
				veiculo.setQtdPneu(ler.nextInt());
				
				System.out.println("-> COR (Ex:. Branco): ");
				veiculo.setCor(ler.nextLine());
				
				System.out.println("-> PLACA(Ex:. AE34F65): ");
				veiculo.setPlaca(ler.nextLine());
				
				System.out.println("-> TOTAL DONOS(Ex:. 2): ");
				veiculo.setTotalDonos(ler.nextInt());
				
				System.out.println("-> KMs RODADOS(Ex:. 365.67):");
				veiculo.setKmRodados(ler.nextFloat());
				
				System.out.println("-> TIPO DO VEÍCULO(Ex:. SUV): ");
				veiculo.setTipoAutomovel(ler.nextLine());
				
				System.out.println("-> COMBUSTÍVEL USADO(Ex:. Gasolina): ");
				veiculo.setTipoCombustivel(ler.nextLine());
				
				System.out.println("╚════════════════════════════════════════════════╝\n");
				
				listaVeiculos.add(veiculo);
			}
			case 2: {
				limparConsole();
				Veiculo veiculo = new Veiculo();
				Integer escolhaID = Integer.MAX_VALUE;
				Integer alterar = Integer.MAX_VALUE;
				
					
				System.out.println("╔════════════════════════╗\n");
				System.out.println("║  ID    MARCA    MODELO ║\n");
					
				for (Veiculo v : listaVeiculos) {
						System.out.println("║ " + v.getId() + v.getModelo() + " ║\n");
				}
					
					
				System.out.println("╚══════════════╝\n");
				System.out.println("Selecione o ID do carro para fazer a alteração: ");
				escolhaID = Integer.valueOf(ler.nextLine());
					
				//Fazer para selecionar o carro por meio do ID
					
				while(alterar != 0){
					Integer opcaoAlterar = Integer.MAX_VALUE;
					System.out.println("╔═════════════════════════╗\n"
					                 + "║    MENU DE ALTERAÇÃO    ║\n"
					                 + "║ ┆0 ┆ SAIR               ║\n"
					                 + "║ ┆1 ┆ MARCA              ║\n"
					                 + "║ ┆2 ┆ MODELO             ║\n"
					                 + "║ ┆3 ┆ ANO DE FABRICACÃO  ║\n"
					                 + "║ ┆4 ┆ QUANTIDADE DE PNEU ║\n"
					                 + "║ ┆5 ┆ COR                ║\n"
					                 + "║ ┆6 ┆ PLACA              ║\n"
					                 + "║ ┆7 ┆ TOTAL DONOS        ║\n"
					                 + "║ ┆8 ┆ KMs RODADOS        ║\n"
					                 + "║ ┆9 ┆ TIPO VEÍCULO       ║\n"
					                 + "║ ┆10┆ COMBUSTÍVEL USADO  ║\n"
					                 + "╚═════════════════════════╝\n");
					
					System.out.println("Informe o que deseja alterar: ");
					opcaoAlterar =  Integer.valueOf(ler.nextLine());
					
					switch (opcaoEscolhida) {
					case 0: {
						break;
					}
					case 1: {
						System.out.println("Informe a nova Marca: ");
						
					}
					case 2: {
						
					}
					case 3: {
						
					}
					case 4: {
						
					}
					}
				}
				
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
							break;
						}
					}
					
					if(encontrou == false) 
					{
						System.out.println("Codigo informado nao existe");
					}
					
					
				}
			}
			case 4: {
				limparConsole();
				limparConsole();
				Veiculo veiculo = new Veiculo();
				System.out.println("╔════════════════════════╗\n");
				System.out.println("║   LISTA DE VEICULOS    ║\n");
				for (Veiculo v : listaVeiculos) {
					System.out.println("║ Marca: " + v.getMarca() + " ║\n"
									 + "║ Modelo: " + v.getModelo() + " ║\n"
									 + "║ Ano fabricação: " + v.getAnoFabricacao() + " ║\n"
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
