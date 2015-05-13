package br.com.alvoradamaringa.persistence;

<<<<<<< HEAD
import br.com.alvoradamaringa.domain;
import java.util.List;

public interface DefesaComentarioDAO extends GenericDAO<Long, DefesaComentario> {

<<<<<<< HEAD
    public List<DefesaComentario> consultar(String comentario) {
        return null;
    }
=======
    public List<DefesaComentario> consultar(String comentario);
>>>>>>> origin/correção
=======
public interface DefesaComentarioDAO extends GenericDAO<Long, DefesaComentario> {

	public void consultar(String comentario);
>>>>>>> 2188b6f... DAO update

}
