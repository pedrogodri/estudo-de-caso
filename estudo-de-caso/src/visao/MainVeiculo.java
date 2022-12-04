package visao;

//import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Usuario;
import modelo.Veiculo;
import controle.UsuarioDAO;
import controle.VeiculoDAO; 

public class MainVeiculo {
	public static void main(String[] args) {
				Scanner ler = new Scanner(System.in);

		
		//Usuario
		Integer opcaoEscolhida = Integer.MAX_VALUE;
	    ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		Integer opcaoSelecionada = Integer.MAX_VALUE;
		UsuarioDAO bancoUsuario = UsuarioDAO.getInstanciaUsuario();
		ArrayList<Usuario> lista = bancoUsuario.listarUsuarios();
		Usuario u = new Usuario(null, null, null, null, null, null, null, null);

		
		Integer opcaoAlterar = Integer.MAX_VALUE;
		VeiculoDAO opcaoVeiculo = new VeiculoDAO();
		Veiculo veiculo = new Veiculo(null, null, opcaoEscolhida, opcaoEscolhida, null, null, opcaoEscolhida, null, null, null);

		
		while (opcaoSelecionada != 0) {
			System.out.println("==================\n" + 
					  "| MENU CADASTRO     |\n" 
					+ "| [0] AVANCAR       |\n"
					+ "| [1] CADASTRAR     |\n" 
					+ "| [2] LISTAR        |\n" + "==================\n");
			System.out.print("Selecione uma opcao de cadastro acima: ");
			opcaoSelecionada = Integer.valueOf(ler.nextLine());
			
			
			
			switch (opcaoSelecionada) {
			case 0: {
				break;
			}
			case 1: {
				System.out.println("==================================================\n"
						+ "| NECESSITAMOS DE ALGUMAS INFORMACOES PARA O CADASTRO |\n"
						+ "==================================================\n");
				System.out.println("-> NOME(Ex:. Rafael): ");
				String nome = ler.nextLine();
				if (!nome.isEmpty()) {
					u.setNome(String.valueOf(nome));
				} else {
					System.out.println("Erro no nome");
				}

				System.out.println("-> IDADE(Ex:. 18): ");
				String idade = ler.nextLine();
				if (!idade.isEmpty()) {
					u.setIdade(String.valueOf(idade));
				} else {
					System.out.println("Erro na Idade");
				}

				System.out.println("-> CPF(Ex:. 235.673.049-34): ");
				String cpf = ler.nextLine();
				if (!cpf.isEmpty()) {
					u.setCpf(String.valueOf(cpf));
				} else {
					System.out.println("Erro no Cpf");
				}
				
				System.out.println("-> RG(Ex:. 3.0493.455): \"");
				String rg = ler.nextLine();
				if (!rg.isEmpty()) {
					u.setRg(String.valueOf(rg));
				} else {
					System.out.println("Erro no Rg");
				}
				
				System.out.println("-> Telefone(Ex:. (47) 99049-3479): \"");
				String numTelefone = ler.nextLine();
				if (!numTelefone.isEmpty()) {
					u.setNumTelefone(String.valueOf(numTelefone));
				} else {
					System.out.println("Erro no Numero de telefone");
				}
				
				System.out.println("-> Email (Ex:. youremail@email.com): \"");
				String email = ler.nextLine();
				if (!email.isEmpty()) {
					u.setEmail(String.valueOf(email));
				} else {
					System.out.println("Erro no Email");
				}

				System.out.println("-> CEP (Ex:. 12345-612): \"");
				String cep = ler.nextLine();
				if (!cep.isEmpty()) {
					u.setCep(String.valueOf(cep));
				} else {
					System.out.println("Erro no Cep");
				}

				System.out.println("-> Sexo (Ex:. Masculino): \"");
				String sexo = ler.nextLine();
				if (!sexo.isEmpty()) {
					u.setSexo(String.valueOf(sexo));
				} else {
					System.out.println("Erro no Sexo");
				}
				
				System.out.println("===================================================\n");
				
				bancoUsuario.criarUsuario(u);
				
				break;
				
			}
			case 2: {
				
				
	
				System.out.println("==========================\n");
				System.out.println("|   LISTA DE USUARIOS    |\n");
				for (Usuario usuario : lista) {
					System.out.println("| Nome: " + usuario.getNome() + "    |\n" 
							+ "| Idade: " + usuario.getIdade() + "    |\n"
							+ "| CPF: " + usuario.getCpf() + "    |\n" 
							+ "| RG: " + usuario.getRg() + "    |\n" 
							+ "| Telefone: " + usuario.getNumTelefone() + "    |\n" 
							+ "| Email: " + usuario.getEmail() + "    |\n"
							+ "| CEP: " + usuario.getCep() + "    |\n" 
							+ "| Sexo: " + usuario.getSexo() + "    |\n" );
				}
				System.out.println("========================\n");
				break;
			}
			default:
				break;
			}
			
			}
			
		

		while (opcaoEscolhida != 0) {
			System.out.println("==================\n" + "| MENU PRINCIPAL |\n" + "| [0] SAIR       |\n"
					+ "| [1] CADASTRAR  |\n" + "| [2] ALTERAR    |\n" + "| [3] EXCLUIR    |\n" + "| [4] LISTAR     |\n"
					+ "==================\n");

			System.out.print("Selecione uma opcao acima: ");
			opcaoEscolhida = Integer.valueOf(ler.nextLine());

			switch (opcaoEscolhida) {
			case 0: {
				break;
			}
			case 1: {
				opcaoVeiculo.cadastrarVeiculo(veiculo);
				listaVeiculos.add(veiculo);
				break;
			}
			case 2: {
//				limparConsole();
				Boolean encontrou = false;
				Integer id;

				System.out.println("=========================================\n");
				System.out.println("|    ID    |    MARCA    |    MODELO    |\n");

				for (Veiculo v : listaVeiculos) {
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

						for (Veiculo v : listaVeiculos) {
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
					break;
			}
			case 3: {
//				limparConsole();
				Integer opcao;
				Boolean encontrou = false;
				Integer id;

				while (true) {
					System.out.println("=========================================\n");
					System.out.println("|    ID    |    MARCA    |    MODELO    |\n");

					for (Veiculo v : listaVeiculos) {
						System.out.println("|    " + v.getId() + "    |    "+ v.getMarca() + "    |    " + v.getModelo() + "    |\n");
					}
					System.out.println("=========================================\n");

					System.out.println("Informe o id do veiculo para excluir: ");
					id = Integer.valueOf(ler.nextLine());

					if (id.equals(0)) {
						System.out.println("Você saiu");
						break;
					}

					for (Veiculo v : listaVeiculos) {
						if (id.equals(v.getId())) {
							encontrou = true;
							listaVeiculos.remove(v);
							System.out.println("Operacao feita com sucesso");
							break;
						}
					}

					if (encontrou == false) {
						System.out.println("Codigo informado nao existe");
						break;
					}
					break;
				}
//				opcaoVeiculo.excluir(veiculo, opcaoEscolhidaUsuario);
				break;
			}
			case 4: {
//				limparConsole();
				System.out.println("==========================\n");
				System.out.println("|   LISTA DE VEICULOS    |\n");
				for (Veiculo v : listaVeiculos) {
					System.out.println("| Marca: " + v.getMarca() + "    |\n" 
							+ "| Modelo: " + v.getModelo() + "    |\n"
							+ "| Ano fabricacao: " + v.getAnoFabricacao() + "    |\n" 
							+ "| Pneus: " + v.getQtdPneu() + "    |\n" 
							+ "| Cor: " + v.getCor() + "    |\n" 
							+ "| Placa: " + v.getPlaca() + "    |\n"
							+ "| Total donos: " + v.getTotalDonos() + "    |\n" 
							+ "| KM rodados: " + v.getKmRodados() + "    |\n" 
							+ "| Tipo automovel: " + v.getTipoAutomovel() + "    |\n" 
							+ "| Tipo combustivel: " + v.getTipoCombustivel() + "    |\n");
				}
				System.out.println("========================\n");
				break;
			}
			default:
				break;
			}
		}
		
		ler.close();

	}

//	public static void limparConsole()
//	{
//		Scanner scanner = new Scanner(System.in);
//        String texto = scanner.next();
//
//        //Limpa a tela no windows, no linux e no MacOS
//        if (System.getProperty("os.name").contains("Windows"))
//			try {
//				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//			} catch (InterruptedException | IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		else
//			try {
//				Runtime.getRuntime().exec("clear");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
	
}
