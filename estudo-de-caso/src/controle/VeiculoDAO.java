package controle;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.IVeiculoDAO;
import modelo.Veiculo;

public class VeiculoDAO implements IVeiculoDAO {
	
	private static ArrayList<Veiculo> listaVeiculos;
	private static VeiculoDAO instancia;
	Veiculo veiculo = new Veiculo(null, null, null, null, null, null, null, null, null, null);
	Scanner ler = new Scanner(System.in);
	
	public VeiculoDAO() {
	}
	
	public static VeiculoDAO getInstancia() {

		if (instancia == null) {
			instancia = new VeiculoDAO();
			listaVeiculos = new ArrayList<>();
		}
		return instancia;
	}
	
	
	@Override
	public boolean cadastrarVeiculo(Veiculo veiculo) {
		System.out.println("==================================================\n"
				+ "| NECESSITAMOS DE ALGUMAS INFORMACOES DO VEICULO |\n"
				+ "==================================================\n");
		System.out.println("-> ID(Ex:. 1): ");
		veiculo.setId(Integer.valueOf(ler.nextLine()));
		
		System.out.println("-> MARCA(Ex:. Fiat): ");
		veiculo.setMarca(ler.nextLine());

		System.out.println("-> MODELO(Ex:. Argo): ");
		veiculo.setModelo(ler.nextLine());

		System.out.println("-> ANO DE FABRICACAO(Ex:. 2022): ");
		veiculo.setAnoFabricacao(Integer.valueOf(ler.nextLine()));

		System.out.println("-> QUANTIDADE DE PNEU(Ex:. 4): ");
		veiculo.setQtdPneu(Integer.valueOf(ler.nextLine()));

		System.out.println("-> COR (Ex:. Branco): ");
		veiculo.setCor(ler.nextLine());

		System.out.println("-> PLACA(Ex:. AE34F65): ");
		veiculo.setPlaca(ler.nextLine());

		System.out.println("-> TOTAL DONOS(Ex:. 2): ");
		veiculo.setTotalDonos(Integer.valueOf(ler.nextLine()));

		System.out.println("-> KMs RODADOS(Ex:. 365.67):");
		veiculo.setKmRodados(Float.valueOf(ler.nextLine()));

		System.out.println("-> TIPO DO VEICULO(Ex:. SUV): ");
		veiculo.setTipoAutomovel(ler.nextLine());

		System.out.println("-> COMBUSTIVEL USADO(Ex:. Gasolina): ");
		veiculo.setTipoCombustivel(ler.nextLine());

		System.out.println("===================================================\n");

		
		
		return true;
	}

	@Override
	public boolean alterar(Veiculo v, Integer id) {
		Boolean encontrou = false;

		System.out.println("=========================================\n");
		System.out.println("|    ID    |    MARCA    |    MODELO    |\n");

		for (veiculo : listaVeiculos) {
			System.out.println("|    " + v.getId() + "    |    "+ v.getMarca() + "    |    " + v.getModelo() + "    |\n");
			System.out.println("=========================================\n	");
		}

		System.out.println("=========================================\n");
		System.out.println("Selecione o ID do carro para fazer a alteração: ");
		id = Integer.valueOf(ler.nextLine());

		while (opcaoAlterar != 0) {

			System.out.println("===========================\n" + "|    MENU DE ALTERACAO    |\n"
					+ "| [0]  SAIR               |\n" + "| [1]  MARCA              |\n"
					+ "| [2]  MODELO             |\n" + "| [3]  ANO DE FABRICACAO  |\n"
					+ "| [4]  QUANTIDADE DE PNEU |\n" + "| [5]  COR                |\n"
					+ "| [6]  PLACA              |\n" + "| [7]  TOTAL DONOS        |\n"
					+ "| [8]  KMs RODADOS        |\n" + "| [9]  TIPO VEÍCULO       |\n"
					+ "| [10] COMBUSTIVEL USADO  |\n" + "===========================\n");

			System.out.println("Informe o que deseja alterar: ");
			opcaoAlterar = Integer.valueOf(ler.nextLine());

			switch (opcaoAlterar) {
			case 0: {
				break;
			}
			case 1: {
				System.out.println("Informe a nova Marca: ");

				for (Veiculo v : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setMarca(ler.nextLine());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			case 2: {
				System.out.println("Informe o novo Modelo: ");

				for (Veiculo v : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setModelo(ler.nextLine());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			case 3: {
				System.out.println("Informe o novo Ano de Fabricacao: ");

				for (Veiculo v : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setAnoFabricacao(ler.nextInt());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			case 4: {
				System.out.println("Informe a nova quantidade de Pneu: ");

				for (Veiculo v : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setQtdPneu(ler.nextInt());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			case 5: {
				System.out.println("Informe a nova Cor: ");

				for (Veiculo v : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setCor(ler.nextLine());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			case 6: {
				System.out.println("Informe a nova Placa: ");

				for (Veiculo v : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setPlaca(ler.nextLine());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			case 7: {
				System.out.println("Informe o novo total de Donos: ");

				for (Veiculo v : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setTotalDonos(ler.nextInt());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			case 8: {
				System.out.println("Informe a nova Quilometragem: ");

				for (Veiculo v : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setKmRodados(ler.nextFloat());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			case 9: {
				System.out.println("Informe o novo Tipo de Automovel: ");

				for (Veiculo v : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setTipoAutomovel(ler.nextLine());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			case 10: {
				System.out.println("Informe o novo Tipo de Combustivel: ");

				for (veiculos : listaVeiculos) {
					if (id.equals(v.getId())) {
						encontrou = true;
						veiculo.setTipoCombustivel(ler.nextLine());
						System.out.println("Operacao feita com sucesso");
						break;
					}
				}

				if (encontrou == false) {
					System.out.println("Codigo informado nao existe");
				}
				break;
			}
			default:
				break;
			}
		}
	}

	@Override
	public boolean excluir(Veiculo v, Integer id) {
		for (Veiculo veiculo : listaVeiculos) {
			if(veiculo.getId() == id) {
				listaVeiculos.remove(veiculo);
				return true;
			}
	}
		return false;
	}

	@Override
	public boolean comprar(Veiculo v, Integer id) {
		for (Veiculo veiculo : listaVeiculos) {
			if(veiculo.getId() == id) {
				listaVeiculos.remove(veiculo);
				return true;
			}
	}
		return false;
	}
	
	@Override
	public ArrayList<Veiculo> listarVeiculos() {
		return listaVeiculos;
	}

}
