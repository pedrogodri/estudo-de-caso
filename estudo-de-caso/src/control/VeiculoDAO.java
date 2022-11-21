package control;

import java.util.ArrayList;

import model.Veiculo;

public interface VeiculoDAO {
    
	public ArrayList<Veiculo> listarVeiculos();
    
	public boolean cadastrar(Veiculo v);
    
	public boolean alterar(Veiculo v, Integer id);
    
	public boolean excluir(Veiculo v, Integer id);

}
