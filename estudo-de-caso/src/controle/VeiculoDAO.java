package controle;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Caminhao;
import modelo.Carro;
import modelo.IVeiculoDAO;
import modelo.Moto;
import modelo.Onibus;
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
	public boolean cadastrarVeiculo(Veiculo v, Carro c, Moto m, Onibus o, Caminhao ca) {
		System.out.println("==================================================\n"
				+ "| NECESSITAMOS DE ALGUMAS INFORMACOES DO VEICULO |\n"
				+ "==================================================\n");
		System.out.println("-> ID(Ex:. 1): ");
		Integer id = Integer.valueOf(ler.nextLine());
		if (!id.toString().isEmpty()) {
			v.setId(Integer.valueOf(id));
		} else {
			System.out.println("Erro no id");
		}
		
		System.out.println("->TIPO VEICULO(Ex:. Moto, Carro, Onibus");
		String tipoV = ler.nextLine();
		
		switch (tipoV) {
		case "Moto":{
			System.out.println("-> NUMERO DE RODAS(Ex:. 2): ");
			 Integer rodas = Integer.valueOf(ler.nextLine());
				m.setNumeroRodas(rodas);
				
				
			System.out.println("-> CILINDROS(Ex:. 200): ");
			 Integer cilindros = Integer.valueOf(ler.nextLine());
				m.setCilindroMoto(cilindros);
				
				
			System.out.println("-> Bagageiro(Ex:. Sim ou Nao): ");
				String bagageiro = ler.nextLine();
				String sim = "Sim";
				if ((bagageiro.equals(sim)) == true ){
						 m.setBagageiro(true);
				} else {
					m.setBagageiro(false);
				}
				
		
			
			break;
		}
			
		case "Caminhao":{
			System.out.println("-> QUANTIDADE DE PESO(Ex:. 30000): ");
			 Integer peso = Integer.valueOf(ler.nextLine());
				ca.setQuantidadePeso(peso);
			
			break;
		}
		
		case "Onibus":{
			System.out.println("-> QUANTIDADE DE ASSENTOS(Ex:. 12): ");
			 Integer assento = Integer.valueOf(ler.nextLine());
				o.setQuantidadeAssentos(assento);
			break;
		}
		case "Carro":{
			System.out.println("-> QUANTIDADE DE PORTAS(Ex:. 4): ");
			 Integer portas = Integer.valueOf(ler.nextLine());
				c.setNumeroPortas(portas);
				
				System.out.println("-> QUANTIDADE DE BANCOS(Ex:. 4): ");
				 Integer bancos = Integer.valueOf(ler.nextLine());
					c.setNumeroBancos(bancos);
					
					System.out.println("-> POSSUI AIRBAG(Ex:. Sim ou Nao): ");
					 String airbag = ler.nextLine();
						String s = "Sim";
						if ((airbag.equals(s)) == true ){
								 c.setAirBag(true);
						} else {
							c.setAirBag(false);
						}
						
						System.out.println("-> POSSUI ARCONDICIONADO(Ex:. Sim ou Nao): ");
						 String ar = ler.nextLine();
							String ss = "Sim";
							if ((ar.equals(ss)) == true){
									 c.setArCodicionado(true);
							} else {
								c.setArCodicionado(false);
							}
							
							System.out.println("-> QUANTIDADE DE CAVALOS(Ex:. 4): ");
							 Integer cavalos = Integer.valueOf(ler.nextLine());
								c.setCavalosMotor(cavalos);
						
			
			break;
		}
		default: {
			break;
		}
		}
			
		
		System.out.println("-> MARCA(Ex:. Fiat): ");
		String marca = ler.nextLine();
		if (!marca.isEmpty()) {
			v.setMarca(String.valueOf(marca));
		} else {
			System.out.println("Erro na marca");
		}

		System.out.println("-> MODELO(Ex:. Argo): ");
		String modelo = ler.nextLine();
		if (!modelo.isEmpty()) {
			v.setModelo(String.valueOf(modelo));
		} else {
			System.out.println("Erro no modelo");
		}

		System.out.println("-> ANO DE FABRICACAO(Ex:. 2022): ");
		Integer anoFabricacao = Integer.valueOf(ler.nextLine());
		if (!anoFabricacao.toString().isEmpty()) {
			v.setAnoFabricacao(Integer.valueOf(anoFabricacao));
		} else {
			System.out.println("Erro no ano de fabricação");
		}

		System.out.println("-> QUANTIDADE DE PNEU(Ex:. 4): ");
		Integer qtdPneu = Integer.valueOf(ler.nextLine());
		if (!qtdPneu.toString().isEmpty()) {
			v.setQtdPneu(Integer.valueOf(qtdPneu));
		} else {
			System.out.println("Erro na quantidade de pneus");
		}

		System.out.println("-> COR (Ex:. Branco): ");
		String cor = ler.nextLine();
		if (!cor.isEmpty()) {
			v.setModelo(String.valueOf(cor));
		} else {
			System.out.println("Erro na cor");
		}

		System.out.println("-> PLACA(Ex:. AE34F65): ");
		String placa = ler.nextLine();
		if (!placa.isEmpty()) {
			v.setPlaca(String.valueOf(placa));
		} else {
			System.out.println("Erro na placa");
		}

		System.out.println("-> TOTAL DONOS(Ex:. 2): ");
		Integer totalDonos = Integer.valueOf(ler.nextLine());
		if (!qtdPneu.toString().isEmpty()) {
			v.setTotalDonos(Integer.valueOf(totalDonos));
		} else {
			System.out.println("Erro na quantidade de pneus");
		}

		System.out.println("-> KMs RODADOS(Ex:. 365.67):");
		Float kmRodados = Float.valueOf(ler.nextLine());
		if (!kmRodados.toString().isEmpty()) {
			v.setKmRodados(Float.valueOf(kmRodados));
		} else {
			System.out.println("Erro na quantidade de pneus");
		}
		

		System.out.println("-> TIPO DO VEICULO(Ex:. SUV): ");
		String tipoAutomovel = ler.nextLine();
		if (!tipoAutomovel.isEmpty()) {
			v.setTipoAutomovel(String.valueOf(tipoAutomovel));
		} else {
			System.out.println("Erro no tipo veiculo");
		}

		System.out.println("-> COMBUSTIVEL USADO(Ex:. Gasolina): ");
		String tipoCombustivel = ler.nextLine();
		if (!tipoCombustivel.isEmpty()) {
			v.setTipoCombustivel(String.valueOf(tipoCombustivel));
		} else {
			System.out.println("Erro no tipo veiculo");
		}

		System.out.println("===================================================\n");
		
		return true;
	}


	@Override
	public boolean excluir(Veiculo v, Integer id) {
		Integer opcao;
		Boolean encontrou = false;

		while (true) {
			System.out.println("=========================================\n");
			System.out.println("|    ID    |    MARCA    |    MODELO    |\n");

			for (Veiculo v1 : listaVeiculos) {
				System.out.println("|    " + v1.getId() + "    |    "+ v1.getMarca() + "    |    " + v1.getModelo() + "    |\n");
			}
			System.out.println("=========================================\n");

			System.out.println("Informe o id do veiculo para excluir: ");
			id = Integer.valueOf(ler.nextLine());

			if (id.equals(0)) {
				System.out.println("Você saiu");
				break;
			}

			for (Veiculo v1 : listaVeiculos) {
				if (id.equals(v1.getId())) {
					encontrou = true;
					listaVeiculos.remove(v1);
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
		return false;
	}

	@Override
	public boolean comprar(Veiculo v, Integer id) {
		for (Veiculo veiculo : listaVeiculos) {
			if(veiculo.getId() == id) {
				listaVeiculos.remove(v);
				return true;
			}
	}
		return false;
	}
	
	@Override
	public ArrayList<Veiculo> listarVeiculos() {
		
		return listaVeiculos;
	}

	@Override
	public boolean alterar(Veiculo v, Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
