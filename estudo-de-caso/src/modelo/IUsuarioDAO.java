package modelo;

public interface IUsuarioDAO {
	
	public boolean criarUsuario(Usuario u);

	public boolean excluirUsuario(Usuario u, String rg);

}
