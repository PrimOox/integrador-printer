package br.com.alvoradamaringa.persistence;

public class UsuarioDAOImpl extends GenericDAOImpl<Long, Usuario> implements
		UsuarioDAO {

<<<<<<< HEAD
	public void consultar(String nome, String login) {

	}
=======
public class UsuarioDAOImpl extends GenericDAOImpl<Long, Usuario> implements UsuarioDAO {
  
  public List<Usuario> consultar(String login, String nome) {
    return null;
  }
>>>>>>> alvoradamaringa/integrador

}
