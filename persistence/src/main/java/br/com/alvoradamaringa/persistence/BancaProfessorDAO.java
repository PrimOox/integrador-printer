package br.com.alvoradamaringa.persistence;

public interface BancaProfessorDAO extends GenericDAO<Long, BancaProfessor> {

<<<<<<< HEAD
	public void consultarBancaProfessor();
=======
public interface BancaProfessorDAO extends GenericDAO<Long, BancaProfessor>{
  
   public List<BancaProfessor> consultar(String nomeAluno, String nomeProfessor){
       return null;
   }
>>>>>>> alvoradamaringa/integrador

}
