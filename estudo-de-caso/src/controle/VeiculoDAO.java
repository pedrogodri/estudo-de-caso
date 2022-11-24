package control;

import java.util.ArrayList;

import model.Veiculo;
import model.IVeiculoDAO;

public class VeiculoDAO implements IVeiculoDAO {
	private ArrayList<Veiculo> veiculos;
	
	public VeiculoDAO() {
		this.veiculos = new ArrayList<>();
	}
	
	@Override
	public ArrayList<Veiculo> listarVeiculos() {
		return null;
	}
	
	@Override
	public boolean cadastrar(Veiculo v) {
		if (v != null) {
			this.veiculos.add(v);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Veiculo v, Integer id) {
		return false;
	}

	@Override
	public boolean excluir(Veiculo v, Integer id) {
		return false;
	}
}
