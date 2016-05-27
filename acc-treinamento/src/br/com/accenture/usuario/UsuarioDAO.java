package br.com.accenture.usuario;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;


import br.com.accenture.conexao.ConexaoHibernate;

public class UsuarioDAO {
    
	private Session session;
	private Transaction tx;

	public UsuarioDAO() {
		session = ConexaoHibernate.getInstance();		
	}
    
	public Usuario consulta2Parametros (String url, String campo1, String parametro1, String campo2, String parametro2) {
        
		Usuario usuario = new Usuario();
		
        try {
                tx = session.beginTransaction();
                
                Query query = (Query) session.createQuery(url).setParameter(campo1, parametro1)
                		.setParameter(campo2, parametro2);
                
                usuario = (Usuario) query.getSingleResult();
                
                tx.commit();
                
        } catch (Exception e) {
                e.printStackTrace();
                tx.rollback();
        } finally {
                session.close();
        }
		return usuario;

    }
    
    public void salvar(Usuario i) {
    	
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
    
    public void excluir(Usuario i) {

        try {
                tx = session.beginTransaction();
                session.delete(i);
                tx.commit();
        } catch (Exception e) {
                e.printStackTrace();
                tx.rollback();
        } finally {
                session.close();
        }
        
    }

}
