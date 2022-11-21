package model;

public class Veiculo {
	
	private Integer id;

	private String marca;
	private String modelo;
	private Integer anoFabricação;
	private Integer qtdPneu;
	private String cor;
	private String placa;
	private Integer totalDonos;
	private Integer kmRodados;
	private String tipoAutomovel;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
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
	public Integer getAnoFabricação() {
		return anoFabricação;
	}
	public void setAnoFabricação(Integer anoFabricação) {
		this.anoFabricação = anoFabricação;
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
	public Integer getTotalDonos() {
		return totalDonos;
	}
	public void setTotalDonos(Integer totalDonos) {
		this.totalDonos = totalDonos;
	}
	public Integer getKmRodados() {
		return kmRodados;
	}
	public void setKmRodados(Integer kmRodados) {
		this.kmRodados = kmRodados;
	}
	public String getTipoAutomovel() {
		return tipoAutomovel;
	}
	public void setTipoAutomovel(String tipoAutomovel) {
		this.tipoAutomovel = tipoAutomovel;
	}
}