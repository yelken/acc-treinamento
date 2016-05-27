package br.com.accenture.servico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.accenture.usuario.Usuario;
import br.com.accenture.usuario.UsuarioBusiness;

@Path("/login")
public class ServicoLogin {
	
	private UsuarioBusiness usuarioBusiness;
	
	public ServicoLogin() {
		usuarioBusiness = new UsuarioBusiness();
	}
	
	@Path("{usuario}&{senha}")
	@GET
	@Produces("application/json")
	public Usuario login(@PathParam("usuario") String usuario, 
			@PathParam("senha") String senha) {
		return usuarioBusiness.login(usuario, senha);
	}

}
