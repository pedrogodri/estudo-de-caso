package model;

import java.util.ArrayList;

public interface IVeiculoDAO {
    
	public ArrayList<Veiculo> listarVeiculos();
    
	public boolean cadastrar(Veiculo v);
    
	public boolean alterar(Veiculo v, Integer id);
    
	public boolean excluir(Veiculo v, Integer id);

}
