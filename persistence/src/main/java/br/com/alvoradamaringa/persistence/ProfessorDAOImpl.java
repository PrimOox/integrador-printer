package br.com.alvoradamaringa.persistence;

import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.Professor;

@Stateless
public class ProfessorDAOImpl extends GenericDAOImpl<Long, Professor> implements ProfessorDAO {

	public List<Professor> consultar(String nome) {
		return null;
	}

	@Override
	public List<Professor> consultar(String nomeProfessor, String cpf) {
		return null;
	}

	@Override
	public Professor consultarCpf(String cpf) {
		return null;
	}
}
