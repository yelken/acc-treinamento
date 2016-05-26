package br.com.accenture.servico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.accenture.escola.Escola;
import br.com.accenture.inscricao.Inscricao;
import br.com.accenture.inscricao.InscricaoDAO;

@Path("/inscricao")
public class ServicoInscricao {

    
    @Path("{nome}&{email}&{idEscola}")
    @GET
    @Produces("application/xml")
    public String inserirInscricao(@PathParam("nome") String nome,
                                   @PathParam("email") String email,
                                   @PathParam("idEscola") Integer idEscola) {
        
        
        Inscricao inscricao = new Inscricao();
        inscricao.setNome(nome);
        inscricao.setEmail(email);
        
        Escola escola = new Escola();
        escola.setIdentifier(idEscola);
        
        inscricao.setEscola(escola);
        
        InscricaoDAO inscricaoDAO = new InscricaoDAO();
        inscricaoDAO.salvar(inscricao);
               
        return "<retornoServico>OK</retornoServico>";
    }
                              
}
