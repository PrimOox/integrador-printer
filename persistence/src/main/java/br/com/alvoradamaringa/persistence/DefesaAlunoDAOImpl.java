package br.com.alvoradamaringa.persistence;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;

import br.com.alvoradamaringa.domain.DefesaAluno;

@Stateless
public class DefesaAlunoDAOImpl extends GenericDAOImpl<Long, DefesaAluno> implements DefesaAlunoDAO {

	public List<DefesaAluno> consultar(String nomeAluno, Date dataDefesa) {
		return null;
	}
	
}
