package br.com.alvoradamaringa.service.spec;

import javax.ejb.Local;

import br.com.alvoradamaringa.domain.Usuario;
import br.com.alvoradamaringa.service.exceptions.LoginInvalidoException;

@Local
public interface LoginService {

	/**
	 * Efetuar login do usu�rio na aplica��o
	 * 
	 * @param usuario Login do Usu�rio
	 * @param senha Senha do Usu�rio
	 * @return Usu�rio autenticado
	 * @throws LoginInvalidoException Erro ao efetuar login (Usu�rio n�o encontrado)
	 */
	Usuario efetuarLogin(String usuario, String senha) throws LoginInvalidoException;
	
}
