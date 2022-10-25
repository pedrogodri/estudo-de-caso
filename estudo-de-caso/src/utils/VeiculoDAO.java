package utils;

import java.util.ArrayList;
import java.util.Random;

import model.Caminhao;
import model.Carro;
import model.Moto;
import model.Pesados;
import model.Veiculo;
import model.Onibus;

public class VeiculoDAO {
	//ArrayList<Pesados> listaPesados = new ArrayList();
	//ArrayList<Carro> listaCarro = new ArrayList();
	//ArrayList<Moto> listaMoto = new ArrayList();
	//ArrayList<Caminhao> listaCaminhao = new ArrayList();
	//ArrayList<Onibus> listaOnibus = new ArrayList();
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
		
		for (int i = 0; i < listaVeiculo.size(); i++) {
			String[] marcaCarro = {"Toyota", "BMW", "Mercedes", "Volkswagen", "Ford", "Fiat", "Audi"};
			String[] modeloCarro = {"Corolla Cross", "M8 Grand Coupé", "Golf GTI", "Fiesta", "Toro", "R8 5.2 FSI"};
			String[] marcaMoto = {"BMW", "Honda", "Yamaha", "Vespa", "Suzuki", "Kawasaki"};
			String[] modeloMoto = {"R 1200", "XRE 190", "TT-R 230", "Classic VXL 150", "GSX-S750", "Ninja 300"};
			String[] modeloCaminhao = {"Scania", "MAN", "Volkswagen", "Iveco", "Volvo", "Mercedes"};
			String[] marcaCaminhao = {"45R", "TGX", "Meteor 29520", "Hi-Way", "FMX", "Axor"};
		}
	}
	
	public Integer gerarNumeroAleatorio() {
		Random gerador = new Random();
		return gerador.nextInt();
	}
}
