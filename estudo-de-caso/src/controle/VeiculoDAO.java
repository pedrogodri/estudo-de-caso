package controle;

import java.util.ArrayList;
import java.util.Random;

import model.Caminhao;
import model.Carro;
import model.IVeiculoDAO;
import model.Moto;
import model.Pesados;
import model.Veiculo;
import model.Onibus;

public class VeiculoDAO implements IVeiculoDAO {
	
	private static ArrayList<Veiculo> listaVeiculo;
	
	public void cadastrarVeiculo() {
		listaVeiculo.add();
	}
	
	public void alterar(Veiculo v) {
		listaVeiculo.remove(v);
		listaVeiculo.add(v);
	}
	
	public void excluir(Veiculo v) {
		listaVeiculo.remove(v);
	}
	
	public void comprar(Veiculo v) {
		listaVeiculo.remove(v);
	}
	
	public void listar(Veiculo v) {
		System.out.println(listaVeiculo);
	}

	@Override
	public void cadastrarVeiculo() {
		// TODO Auto-generated method stub
		
	}
	
	
}
