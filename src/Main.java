import br.com.accenture.escola.Escola;
import br.com.accenture.escola.EscolaDAO;
import br.com.accenture.inscricao.Inscricao;
import br.com.accenture.inscricao.InscricaoDAO;



public class Main {

    public static void main(String[] args) {
        Escola escola = new Escola();
        escola.setIdentifier(1);
        escola.setDescricao("MALBA LUCENA");
        escola.setEndereco("Av. Conde da Boa Vista");
//        EscolaDAO escolaDAO = new EscolaDAO();
//        escolaDAO.salvar(escola);
        
        Inscricao inscricao = new Inscricao();
        inscricao.setNome("Biu");
        inscricao.setEmail("biu@accenture.com");
        inscricao.setEscola(escola);
        InscricaoDAO inscricaoDAO = new InscricaoDAO();
        inscricaoDAO.salvar(inscricao);
        
    }
}
