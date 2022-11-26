package controle;

import java.util.ArrayList;

import modelo.IVeiculoDAO;
import modelo.Veiculo;

public class VeiculoDAO implements IVeiculoDAO {
	
	private static ArrayList<Veiculo> veiculos;
	private static VeiculoDAO instancia;
	
	private VeiculoDAO() {
	}
	
	public static VeiculoDAO getInstancia() {

		if (instancia == null) {
			instancia = new VeiculoDAO();
			veiculos = new ArrayList<>();
		}
		return instancia;
	}
	
	
	@Override
	public boolean cadastrarVeiculo(Veiculo v) {
		if (v != null) {
			veiculos.add(v);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Veiculo v, Integer id) {
		for (Veiculo veiculo : veiculos) {
			if(veiculo.getId() == id) {
				veiculo.setCor(v.getCor());
				veiculo.setPlaca(v.getPlaca());
				veiculo.setKmRodados(v.getKmRodados());
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean excluir(Veiculo v, Integer id) {
		for (Veiculo veiculo : veiculos) {
			if(veiculo.getId() == id) {
				veiculos.remove(veiculo);
				return true;
			}
	}
		return false;
	}

	@Override
	public boolean comprar(Veiculo v, Integer id) {
		for (Veiculo veiculo : veiculos) {
			if(veiculo.getId() == id) {
				veiculos.remove(veiculo);
				return true;
			}
	}
		return false;
	}
	
	@Override
	public ArrayList<Veiculo> listarVeiculos() {
		return veiculos;
	}

}
