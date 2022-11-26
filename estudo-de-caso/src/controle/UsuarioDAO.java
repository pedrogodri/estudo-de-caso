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
	public boolean excluirUsuario(Usuario u, String rg) {
		for (Usuario usuario : tabelaUsuario) {
			if (usuario.getRg() == rg) {
				tabelaUsuario.remove(usuario);
				return true;
			}
		}

		return false;
	}

}
