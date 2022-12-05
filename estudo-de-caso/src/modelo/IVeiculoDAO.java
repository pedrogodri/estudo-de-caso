package modelo;

import java.util.ArrayList;

public interface IVeiculoDAO {
	
	public boolean cadastrarVeiculo(Veiculo v, Carro c, Moto m, Onibus o, Caminhao ca);
    
    public boolean alterar(Veiculo v, Integer id);
    
    public boolean excluir(Veiculo v, Integer id);
    
    public boolean comprar(Veiculo v, Integer id);
    
	public ArrayList<Veiculo> listarVeiculos();
	
}
