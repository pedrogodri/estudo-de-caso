package controle;

import java.util.ArrayList;
import java.util.Random;

import model.Caminhao;
import model.Carro;
import model.Moto;
import model.Pesados;
import model.Veiculo;
import model.Onibus;

public class VeiculoDAO {
	
	ArrayList<Veiculo> listaVeiculo = new ArrayList();
	public VeiculoDAO() {
		listaVeiculo = new ArrayList<Veiculo>();
		cargaListas();
	}
	public void cargaListas() {
		cargaVeiculos();
	}
	public void cargaVeiculos() {
		Integer numeroAleatorio = gerarNumeroAleatorio();
		
		String[] marcaCarro = {"Toyota", "BMW", "Mercedes", "Volkswagen", "Ford", "Fiat", "Audi"};
		String[] modeloCarro = {"Corolla Cross", "M8 Grand Coupé", "Golf GTI", "Fiesta", "Toro", "R8 5.2 FSI"};
		String[] marcaMoto = {"BMW", "Honda", "Yamaha", "Vespa", "Suzuki", "Kawasaki"};
		String[] modeloMoto = {"R 1200", "XRE 190", "TT-R 230", "Classic VXL 150", "GSX-S750", "Ninja 300"};
		String[] marcaCaminhao = {"Scania", "MAN", "Volkswagen", "Iveco", "Volvo", "Mercedes"};
		String[] modeloCaminhao = {"45R", "TGX", "Meteor 29520", "Hi-Way", "FMX", "Axor"};
		String[] marcaOnibus = {"Mercedes", "Volkswagen", "Volvo", "Agrale", "Scania", "Iveco"};
		String[] modeloOnibus = {"Proconve P8", "Vw 18320", "B510R", "MA 10.10", "Scania K", "70C17"};
	}
	
	public Integer gerarNumeroAleatorio() {
		Random gerador = new Random();
		return gerador.nextInt();
	}
}
