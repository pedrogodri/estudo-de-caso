package modelo;

public class Usuario {
	private String nome;
	private Integer idade;
	private String cpf;
	private String rg;
	private String numTelefone; 
	private String email; 
	private String cep;
	private String sexo; 
	
	public Usuario(String nome, Integer idade, String cpf, String rg, 
	String numTelefone, String email, String cep, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;	
		this.numTelefone = numTelefone; 
		this.email = email;
		this.cep = cep;
		this.sexo = sexo; 
		
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
