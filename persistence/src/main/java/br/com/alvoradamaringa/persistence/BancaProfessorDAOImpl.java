package br.com.alvoradamaringa.persistence;

public class BancaProfessorDAOImpl extends GenericDAOImpl<Long, BancaProfessor> implements BancaProfessorDAO {
<<<<<<< HEAD

	@Override
	public void consultarBancaProfessor() {

	}

=======
  
    @Override
+   public List<BancaProfessor> consultar(String nomeAluno, String nomeProfessor) {
      return null;
    }
>>>>>>> alvoradamaringa/integrador
}
