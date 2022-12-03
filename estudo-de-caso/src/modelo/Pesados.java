package modelo;

public class Pesados extends Veiculo {
	public Pesados(String marca, String modelo, Integer anoFabricacao, Integer qtdPneu, String cor, String placa,
			Integer totalDonos, Float kmRodados, String tipoAutomovel, String tipoCombustivel) {
		super(marca, modelo, anoFabricacao, qtdPneu, cor, placa, totalDonos, kmRodados, tipoAutomovel, tipoCombustivel);
		// TODO Auto-generated constructor stub
	}
	private String sistemaFrenagem;
	private Float comprimento;
	
	public String getSistemaFrenagem() {
		return sistemaFrenagem;
	}
	public void setSistemaFrenagem(String sistemaFrenagem) {
		this.sistemaFrenagem = sistemaFrenagem;
	}
	public Float getComprimento() {
		return comprimento;
	}
	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}
}
