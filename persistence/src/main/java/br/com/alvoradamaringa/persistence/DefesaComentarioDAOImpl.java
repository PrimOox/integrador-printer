package br.com.alvoradamaringa.persistence;

import java.util.List;

public class DefesaComentarioDAOImpl extends GenericDAOImpl<Long, DefesaComentario> implements DefesaComentarioDAO {

    @Override
    public List<DefesaComentario> consultar(String comentario) {
        return consultar(comentario);
    }

}
