package controle;

import java.util.ArrayList;

import modelo.IUsuarioDAO;
import modelo.Usuario;

public class UsuarioDAO implements IUsuarioDAO {
	
	private static ArrayList<Usuario> tabelaUsuario;
	private static UsuarioDAO instanciaUsuario;
	
	private UsuarioDAO() {
	}
	
	public static UsuarioDAO getInstanciaUsuario() {

		if (instanciaUsuario == null) {
			instanciaUsuario = new UsuarioDAO();
			tabelaUsuario = new ArrayList<>();
		}

		return instanciaUsuario;
	}
	
	@Override
	public boolean criarUsuario(Usuario u) {
		if (u != null) {
			tabelaUsuario.add(u);
			return true;
		}
		
		return false;
	}

	@Override
	public ArrayList<Usuario> listarUsuarios() {
		return tabelaUsuario;
	}

}
