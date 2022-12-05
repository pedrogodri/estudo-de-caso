package modelo;

public class Moto extends Veiculo {
	public Moto(String marca, String modelo, Integer anoFabricacao, Integer qtdPneu, String cor, String placa,
			Integer totalDonos, Float kmRodados, String tipoAutomovel, String tipoCombustivel) {
		super(marca, modelo, anoFabricacao, qtdPneu, cor, placa, totalDonos, kmRodados, tipoAutomovel, tipoCombustivel);
		// TODO Auto-generated constructor stub
	}

	private Integer numeroRodas;
	private Integer cilindroMoto;
	private Boolean bagageiro;

	public Integer getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(Integer numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public Integer getCilindroMoto() {
		return cilindroMoto;
	}

	public void setCilindroMoto(Integer cilindroMoto) {
		this.cilindroMoto = cilindroMoto;
	}

	public Boolean getBagageiro() {
		return bagageiro;
	}

	public void setBagageiro(Boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
}
