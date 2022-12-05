package modelo;

import java.util.ArrayList;

public interface IUsuarioDAO {
	
	public boolean criarUsuario(Usuario u);

	public ArrayList<Usuario> listarUsuarios();


}
