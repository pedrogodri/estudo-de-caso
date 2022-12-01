package model;

import modelo.Veiculo;

public class Carro extends Veiculo{
	
	private Integer numeroPortas;
	private Integer numeroBancos;
	private Boolean airBag;
	private Boolean arCodicionado;
	private Integer cavalosMotor;
	
	public Integer getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(Integer numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public Integer getNumeroBancos() {
		return numeroBancos;
	}
	public void setNumeroBancos(Integer numeroBancos) {
		this.numeroBancos = numeroBancos;
	}
	public Boolean getAirBag() {
		return airBag;
	}
	public void setAirBag(Boolean airBag) {
		this.airBag = airBag;
	}
	public Boolean getArCodicionado() {
		return arCodicionado;
	}
	public void setArCodicionado(Boolean arCodicionado) {
		this.arCodicionado = arCodicionado;
	}
	public Integer getCavalosMotor() {
		return cavalosMotor;
	}
	public void setCavalosMotor(Integer cavalosMotor) {
		this.cavalosMotor = cavalosMotor;
	}
}
