package controle;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Caminhao;
import modelo.Carro;
import modelo.IVeiculoDAO;
import modelo.Moto;
import modelo.Onibus;
import modelo.Veiculo;

public class VeiculoDAO implements IVeiculoDAO {
	
	private static ArrayList<Veiculo> listaVeiculos;
	private static VeiculoDAO instancia;
	
	Scanner ler = new Scanner(System.in);
	
	public VeiculoDAO() {
	}
	
	public static VeiculoDAO getInstancia() {

		if (instancia == null) {
			instancia = new VeiculoDAO();
			listaVeiculos = new ArrayList<>();
		}
		return instancia;
	}
	
	
	@Override
	public boolean cadastrarVeiculo(Veiculo v, Carro c, Moto m, Onibus o, Caminhao ca) {
		if (v != null) {
			listaVeiculos.add(v);
			return true;
		}
		
		return false;
	}


	@Override
	public boolean excluir(Veiculo v, Integer id) {
		return false;
	
	}

	@Override
	public boolean comprar(Veiculo v, Integer id) {
		for (Veiculo veiculo : listaVeiculos) {
			if(veiculo.getId() == id) {
				listaVeiculos.remove(v);
				return true;
			}
	}
		return false;
	}
	
	@Override
	public ArrayList<Veiculo> listarVeiculos() {
		
		return listaVeiculos;
	}

	@Override
	public boolean alterar(Veiculo v, Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
