package br.com.accenture.usuario;

public class UsuarioBusiness {

	private static final String LOGIN = "SELECT u.usuario, u.senha FROM usuario u WHERE u.usuario=:usuario AND u.senha=:senha";
	
	private static final String USUARIO = "usuario";
	private static final String SENHA = "senha";
	
	private UsuarioDAO usuarioDAO;
	
	public UsuarioBusiness() {
		usuarioDAO = new UsuarioDAO();
	}
	
	public Usuario login (String usuario, String senha) {
		return usuarioDAO.consulta2Parametros(LOGIN, USUARIO, usuario, SENHA, senha);
	}
	
}
