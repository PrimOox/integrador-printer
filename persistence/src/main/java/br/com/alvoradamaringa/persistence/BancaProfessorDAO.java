package br.com.alvoradamaringa.persistence;

public interface BancaProfessorDAO extends GenericDAO<Long, BancaProfessor> {

	public void consultarBancaProfessor();

}
