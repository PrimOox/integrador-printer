package br.com.alvoradamaringa.persistence;

import java.util.List;

import br.com.alvoradamaringa.domain.Aluno;

public class AlunoDAOImpl extends GenericDAOImpl<Long, Aluno> implements AlunoDAO {
	
	public List<Aluno> consultar(String nomeAluno, String ra) {
		return null;
	}
}
