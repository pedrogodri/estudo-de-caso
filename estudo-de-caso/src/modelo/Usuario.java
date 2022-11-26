package modelo;

import java.util.Date;

public class Usuario {
	private String nome;
	private Integer idade;
	private String cpf;
	private Date dataNascimento;
	private String rg;
	
	public Usuario(String nome, Integer idade, String cpf, Date dataNascimento, String rg) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.rg = rg;	
	}
	
	public Usuario() {
		
	}
	
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	

}
