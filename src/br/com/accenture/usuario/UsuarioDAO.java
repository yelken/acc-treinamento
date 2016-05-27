package br.com.accenture.usuario;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.accenture.conexao.ConexaoHibernate;

public class UsuarioDAO {
    
private Session session;
    
    public void salvar(Usuario i) {
        session = ConexaoHibernate.getInstance();
        Transaction tx = null;

        try {
                tx = session.beginTransaction();
                session.save(i);
                tx.commit();
        } catch (Exception e) {
                e.printStackTrace();
                tx.rollback();
        } finally {
                session.close();
        }
}

}
