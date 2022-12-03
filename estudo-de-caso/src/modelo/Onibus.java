package modelo;

public class Onibus extends Pesados {
	
	public Onibus(String marca, String modelo, Integer anoFabricacao, Integer qtdPneu, String cor, String placa,
			Integer totalDonos, Float kmRodados, String tipoAutomovel, String tipoCombustivel) {
		super(marca, modelo, anoFabricacao, qtdPneu, cor, placa, totalDonos, kmRodados, tipoAutomovel, tipoCombustivel);
		// TODO Auto-generated constructor stub
	}
	private Integer quantidadeAssentos;

	public Integer getQuantidadeAssentos() {
		return quantidadeAssentos;
	}
	public void setQuantidadeAssentos(Integer quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}
	
	
}
