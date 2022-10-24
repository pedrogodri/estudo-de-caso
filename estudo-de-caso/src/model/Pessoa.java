package model;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Integer idade;
	private String cpf;
	private Date dataNasciemnto;
	private String rg;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNasciemnto() {
		return dataNasciemnto;
	}
	public void setDataNasciemnto(Date dataNasciemnto) {
		this.dataNasciemnto = dataNasciemnto;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
