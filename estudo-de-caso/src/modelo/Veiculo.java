package modelo;

public class Veiculo {
	
	private Integer id;

	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Integer qtdPneu;
	private String cor;
	private String placa;
	private Integer totalDonos;
	private Float kmRodados;
	private String tipoAutomovel;
	private String tipoCombustivel;
	
	public Veiculo(String marca, String modelo, Integer anoFabricacao, Integer qtdPneu, String cor, String placa, Integer totalDonos, Float kmRodados, String tipoAutomovel, String tipoCombustivel) {
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
		this.kmRodados = kmRodados;
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.qtdPneu = qtdPneu;
		this.tipoAutomovel = tipoAutomovel;
		this.tipoCombustivel = tipoCombustivel;
		this.totalDonos = totalDonos;
	}


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
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
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
	public Float getKmRodados() {
		return kmRodados;
	}
	public void setKmRodados(Float kmRodados) {
		this.kmRodados = kmRodados;
	}
	public String getTipoAutomovel() {
		return tipoAutomovel;
	}
	public void setTipoAutomovel(String tipoAutomovel) {
		this.tipoAutomovel = tipoAutomovel;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
}