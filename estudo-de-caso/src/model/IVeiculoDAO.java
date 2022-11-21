package model;

public interface IVeiculoDAO {
	
	public void cadastrarVeiculo();
	
	public void listar(Veiculo v);
	
	public void alterar(Veiculo v);
	
	public void excluir(Veiculo v);
	
	public void comprar(Veiculo v);

}
