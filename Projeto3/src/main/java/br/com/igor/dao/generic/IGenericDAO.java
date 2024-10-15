package br.com.igor.dao.generic;	
	
import java.io.Serializable;
import java.util.Collection;
import br.com.igor.dao.Persistente;
import br.com.igor.dao.factory.ConnectionFactory;
import br.com.igor.exceptions.DAOException;
import br.com.igor.exceptions.MaisDeUmRegistroException;
import br.com.igor.exceptions.TableException;
import br.com.igor.exceptions.TipoChaveNaoEncontradaException;
import br.com.igor.exceptions.TipoElementoNaoConhecidoException;

public interface IGenericDAO <T extends Persistente, E extends Serializable>{
	
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void excluir(E valor) throws DAOException;
	
	public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
	
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;
	
	public Collection<T> buscarTodos() throws DAOException;
}
