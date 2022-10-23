package model;

public class Veiculo {
	private String marca;
	private String modelo;
	private String tipo;
	private Integer ano;
	private Integer qtdPneu;
	private String cor;
	private String placa;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getQtdPneu() {
		return qtdPneu;
	}
	public void setQtdPneu(Integer qtdPneu) {
		this.qtdPneu = qtdPneu;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
