package model;

public class Pesados extends Veiculo {
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
	public Float getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Float capacidade) {
		this.capacidade = capacidade;
	}
}
