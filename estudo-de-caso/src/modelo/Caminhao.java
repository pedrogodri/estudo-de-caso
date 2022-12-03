package modelo;

public class Caminhao extends Pesados{
	
	public Caminhao(String marca, String modelo, Integer anoFabricacao, Integer qtdPneu, String cor, String placa,
			Integer totalDonos, Float kmRodados, String tipoAutomovel, String tipoCombustivel) {
		super(marca, modelo, anoFabricacao, qtdPneu, cor, placa, totalDonos, kmRodados, tipoAutomovel, tipoCombustivel);
		// TODO Auto-generated constructor stub
	}

	private Integer quantidadePeso;

	public Integer getQuantidadePeso() {
		return quantidadePeso;
	}

	public void setQuantidadePeso(Integer quantidadePeso) {
		this.quantidadePeso = quantidadePeso;
	}
	
	
}
