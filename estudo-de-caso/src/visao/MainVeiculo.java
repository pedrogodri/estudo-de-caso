package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Caminhao;
import modelo.Carro;
import modelo.Moto;
import modelo.Onibus;
import modelo.Usuario;
import modelo.Veiculo;
import controle.UsuarioDAO;
import controle.VeiculoDAO;

public class MainVeiculo {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// USUARIO
		UsuarioDAO bancoUsuario = UsuarioDAO.getInstanciaUsuario();
		ArrayList<Usuario> lista = bancoUsuario.listarUsuarios();
		Usuario u = new Usuario(null, null, null, null, null, null, null, null);

		// MENU
		Integer opcaoEscolhida = Integer.MAX_VALUE;
		Integer opcaoSelecionada = Integer.MAX_VALUE;
		Integer opcaoAlterar = Integer.MAX_VALUE;

		// VEICULO
		ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		Veiculo v = new Veiculo(null, null, opcaoSelecionada, opcaoSelecionada, null, null, opcaoSelecionada, null,
				null, null);
		Moto m = new Moto(null, null, opcaoAlterar, opcaoAlterar, null, null, opcaoAlterar, null, null, null);
		Carro c = new Carro(null, null, opcaoAlterar, opcaoAlterar, null, null, opcaoAlterar, null, null, null);
		Onibus o = new Onibus(null, null, opcaoAlterar, opcaoAlterar, null, null, opcaoAlterar, null, null, null);
		Caminhao ca = new Caminhao(null, null, opcaoAlterar, opcaoAlterar, null, null, opcaoAlterar, null, null, null);
		
		VeiculoDAO opcaoVeiculo = new VeiculoDAO();
		Veiculo veiculo = new Veiculo(null, null, opcaoEscolhida, opcaoEscolhida, null, null, opcaoEscolhida, null,
				null, null);

		// MENU CADDASTRO - USUARIO
		while (opcaoSelecionada != 0) {
			System.out.println("==================\n" + "| MENU CADASTRO     |\n" + "| [0] Avancar       |\n"
					+ "| [1] Cadastrar     |\n" + "| [2] Listar        |\n" +  "| [3] Excluir        |\n" + "==================\n");
			System.out.print("Selecione uma opcao de cadastro acima: ");
			opcaoSelecionada = Integer.valueOf(ler.nextLine());

			switch (opcaoSelecionada) {

			//AVANCAR
			case 0:
			default: {
				break;
			}
			
			//CADASTRAR - USUARIO
			case 1: {
				System.out.println("==================================================\n"
						+ "| NECESSITAMOS DE ALGUMAS INFORMACOES PARA O CADASTRO |\n"
						+ "==================================================\n");
				System.out.println("-> Nome(Ex:. Rafael): ");
				String nome = ler.nextLine();
				if (!nome.isEmpty()) {
					u.setNome(String.valueOf(nome));
				} else {
					System.out.println("Erro no nome");
				}

				System.out.println("-> Idade(Ex:. 18): ");
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

				System.out.println("-> E-mail (Ex:. youremail@email.com): \"");
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
			
			//LISTAR - USUARIO
			case 2: {

				System.out.println("==========================\n");
				System.out.println("|   LISTA DE USUARIOS    |\n");
				for (Usuario usuario : lista) {
					System.out.println("| Nome: " + usuario.getNome() + "    |\n" + "| Idade: " + usuario.getIdade()
							+ "    |\n" + "| CPF: " + usuario.getCpf() + "    |\n" + "| RG: " + usuario.getRg()
							+ "    |\n" + "| Telefone: " + usuario.getNumTelefone() + "    |\n" + "| Email: "
							+ usuario.getEmail() + "    |\n" + "| CEP: " + usuario.getCep() + "    |\n" + "| Sexo: "
							+ usuario.getSexo() + "    |\n");
				}
				System.out.println("========================\n");
				break;
			}
			
			case 3: {
				Boolean encontrou = false;
				String excluir;

				while (true) {
					System.out.println("=========================================\n");
					System.out.println("|    RG    |    NOME    |    CPF    |\n");

					for (Usuario u1 : lista) {
						System.out.println("|    " + u1.getRg() + "    |    " + u1.getNome() + "    |    "
								+ u1.getCpf() + "    |\n");
					}
					System.out.println("=========================================\n");

					System.out.println(u.getRg() + ", informe o RG do usuario para excluir: ");
					excluir = ler.nextLine();

					if (excluir.equals(0)) {
						System.out.println(u.getNome() + " saiu");
						break;
					}

					for (Usuario u1 : lista) {
						if (excluir.equals(u1.getRg())) {
							encontrou = true;
							lista.remove(u1);
							System.out.println(u.getNome() + ", operacao feita com sucesso");
							break;
						}
					}

					if (encontrou == false) {
						System.out.println(u.getNome() + ", codigo informado nao existe");
						break;
					}
					break;
				}
				break;
				
			}
			
			}

		}

		//MENU - VEICULO
		while (opcaoEscolhida != 0) {
			System.out.println("==================\n" + "| MENU PRINCIPAL |\n" + "| [0] Sair       |\n"
					+ "| [1] Cadastrar  |\n" + "| [2] Alterar   |\n" + "| [3] Excluir    |\n" + "| [4] Listar     |\n"
					+ "| [5]  Comprar     |\n" + "==================\n");

			System.out.print(u.getNome() + ", selecione uma opcao acima: ");
			opcaoEscolhida = Integer.valueOf(ler.nextLine());

			switch (opcaoEscolhida) {
			case 0: {
				break;
			}
			
			//CADASTRAR - VEICULO
			case 1: {
				opcaoVeiculo.cadastrarVeiculo(v,c,m,o,ca);
				listaVeiculos.add(v);
				break;
			}
			
			//ALTERAR VEICULO
			case 2: {
				Boolean encontrou = false;
				Integer id;

				System.out.println("=========================================\n");
				System.out.println("|    ID    |    MARCA    |    MODELO    |\n");

				for (Veiculo v1 : listaVeiculos) {
					System.out.println("|    " + v1.getId() + "    |    " + v1.getMarca() + "    |    " + v1.getModelo()
							+ "    |\n");
					System.out.println("=========================================\n	");
				}

				System.out.println("=========================================\n");
				System.out.println(u.getNome() + ", selecione o ID do carro para fazer a alteração: ");
				id = Integer.valueOf(ler.nextLine());

				while (opcaoAlterar != 0) {

					System.out.println("===========================\n" + "|    MENU DE ALTERACAO    |\n"
							+ "| [0]  Sair               |\n" + "| [1]  Marca              |\n"
							+ "| [2]  Modelo             |\n" + "| [3]  Ano de fabricacao  |\n"
							+ "| [4]  Quantidade de pneu |\n" + "| [5]  Cor                |\n"
							+ "| [6]  Placa              |\n" + "| [7]  Total donos        |\n"
							+ "| [8]  KMs rodados        |\n" + "| [9]  Tipo veiculo       |\n"
							+ "| [10] Combustivel usado  |\n" + "===========================\n");

					System.out.println(u.getNome() + ", informe o que deseja alterar: ");
					opcaoAlterar = Integer.valueOf(ler.nextLine());

					switch (opcaoAlterar) {
					case 0: {
						break;
					}
					case 1: {
						System.out.println(u.getNome() + ", informe a nova Marca: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setMarca(ler.nextLine());
								System.out.println(u.getNome() + ", operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", codigo informado nao existe");
						}
						break;
					}
					case 2: {
						System.out.println(u.getNome() + ", informe o novo Modelo: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setModelo(ler.nextLine());
								System.out.println(u.getNome() + ", sua operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", seu codigo informado nao existe");
						}
						break;
					}
					case 3: {
						System.out.println(u.getNome() + ", informe o novo Ano de Fabricacao: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setAnoFabricacao(ler.nextInt());
								System.out.println(u.getNome() + ", Operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", codigo informado nao existe");
						}
						break;
					}
					case 4: {
						System.out.println(u.getNome() + ", informe a nova quantidade de Pneu: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setQtdPneu(ler.nextInt());
								System.out.println(u.getNome() + ", Operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", codigo informado nao existe");
						}
						break;
					}
					case 5: {
						System.out.println(u.getNome() + ", informe a nova Cor: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setCor(ler.nextLine());
								System.out.println(u.getNome() + ", operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", codigo informado nao existe");
						}
						break;
					}
					case 6: {
						System.out.println(u.getNome() + ", informe a nova Placa: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setPlaca(ler.nextLine());
								System.out.println(u.getNome() + ", operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", codigo informado nao existe");
						}
						break;
					}
					case 7: {
						System.out.println(u.getNome() + ", informe o novo total de Donos: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setTotalDonos(ler.nextInt());
								System.out.println(u.getNome() + ", operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", codigo informado nao existe");
						}
						break;
					}
					case 8: {
						System.out.println(u.getNome() + ", informe a nova Quilometragem: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setKmRodados(ler.nextFloat());
								System.out.println(u.getNome() + ", operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", codigo informado nao existe");
						}
						break;
					}
					case 9: {
						System.out.println(u.getNome() + ", informe o novo Tipo de Automovel: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setTipoAutomovel(ler.nextLine());
								System.out.println(u.getNome() + ", operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", codigo informado nao existe");
						}
						break;
					}
					case 10: {
						System.out.println(u.getNome() + ", informe o novo Tipo de Combustivel: ");

						for (Veiculo v1 : listaVeiculos) {
							if (id.equals(v1.getId())) {
								encontrou = true;
								v.setTipoCombustivel(ler.nextLine());
								System.out.println(u.getNome() + ", operacao feita com sucesso");
								break;
							}
						}

						if (encontrou == false) {
							System.out.println(u.getNome() + ", codigo informado nao existe");
						}
						break;
					}
					default:
						break;
					}
				}
				break;
			}
			
			//EXCLUIR VEICULO
			case 3: {
				Integer opcao;
				Boolean encontrou = false;
				Integer id;

				while (true) {
					System.out.println("=========================================\n");
					System.out.println("|    ID    |    MARCA    |    MODELO    |\n");

					for (Veiculo v1 : listaVeiculos) {
						System.out.println("|    " + v1.getId() + "    |    " + v1.getMarca() + "    |    "
								+ v1.getModelo() + "    |\n");
					}
					System.out.println("=========================================\n");

					System.out.println(u.getNome() + ", informe o id do veiculo para excluir: ");
					id = Integer.valueOf(ler.nextLine());

					if (id.equals(0)) {
						System.out.println(u.getNome() + " saiu");
						break;
					}

					for (Veiculo v1 : listaVeiculos) {
						if (id.equals(v1.getId())) {
							encontrou = true;
							listaVeiculos.remove(v1);
							System.out.println(u.getNome() + ", operacao feita com sucesso");
							break;
						}
					}

					if (encontrou == false) {
						System.out.println(u.getNome() + ", codigo informado nao existe");
						break;
					}
					break;
				}
				break;
			}
			
			//LISTAR VEICULO
			case 4: {

				System.out.println("==========================\n");
				System.out.println("|   LISTA DE VEICULOS    |\n");
				for (Veiculo v1 : listaVeiculos) {
					System.out.println("| Marca: " + v1.getMarca() + "    |\n" + "| Modelo: " + v1.getModelo()
							+ "    |\n" + "| Ano fabricacao: " + v1.getAnoFabricacao() + "    |\n" + "| Pneus: "
							+ v1.getQtdPneu() + "    |\n" + "| Cor: " + v1.getCor() + "    |\n" + "| Placa: "
							+ v1.getPlaca() + "    |\n" + "| Total donos: " + v1.getTotalDonos() + "    |\n"
							+ "| KM rodados: " + v1.getKmRodados() + "    |\n" + "| Tipo automovel: "
							+ v1.getTipoAutomovel() + "    |\n" + "| Tipo combustivel: " + v1.getTipoCombustivel() + "    |\n" 
							+ "| Numero portas: " + c.getNumeroPortas() + "    |\n" + "| Numero bancos: "  + c.getNumeroBancos() + "    |\n" 
							+ "| Airbag: " + c.getAirBag() + "    |\n" + "| Ar condicionado: "  + c.getArCodicionado() + "    |\n" +  "| Cavalos: " +  c.getCavalosMotor() + "    |\n" +
							"| Numero de rodas: " + m.getNumeroRodas() + "    |\n" + "| Numero de cilindros: " + m.getCilindroMoto() + "    |\n" + "| Bagageiro: " + m.getBagageiro() + "    |\n" + "| Quantidade de assentos: "  + o.getQuantidadeAssentos() + "    |\n" + "| Quantidade de peso: "  + ca.getQuantidadePeso() +  "|\n");
				}
				System.out.println("========================\n");
				break;
			}
			
			//COMPRAR VEICULO
			case 5: {
				Integer opcao;
				Boolean encontrou = false;
				Integer id;

				while (true) {
					System.out.println("=========================================\n");
					System.out.println("|    ID    |    MARCA    |    MODELO    |\n");

					for (Veiculo v1 : listaVeiculos) {
						System.out.println("|    " + v1.getId() + "    |    " + v1.getMarca() + "    |    "
								+ v1.getModelo() + "    |\n");
					}
					System.out.println("=========================================\n");

					System.out.println(u.getNome() + ", informe o id do veiculo para comprar: ");
					id = Integer.valueOf(ler.nextLine());

					if (id.equals(0)) {
						System.out.println(u.getNome() + " saiu");
						break;
					}

					for (Veiculo v1 : listaVeiculos) {
						if (id.equals(v1.getId())) {
							encontrou = true;
							listaVeiculos.remove(v1);
							System.out.println(u.getNome() + ", operacao feita com sucesso");
							break;
						}
					}

					if (encontrou == false) {
						System.out.println(u.getNome() + ", codigo informado nao existe");
						break;
					}
					break;
				}
				break;
			}

			default:
				break;
			}

		}

		ler.close();

	}

}
