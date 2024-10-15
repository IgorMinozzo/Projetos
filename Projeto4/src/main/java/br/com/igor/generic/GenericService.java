package br.com.igor.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.igor.dao.Persistente;
import br.com.igor.exceptions.DAOException;
import br.com.igor.exceptions.MaisDeUmRegistroException;
import br.com.igor.exceptions.TableException;
import br.com.igor.exceptions.TipoChaveNaoEncontradaException;

public class GenericService <T extends Persistente, E extends Serializable> implements IGenericService<T, E>{

	protected IGenericDAO<T, E> dao;
	
	public GenericService(IGenericDAO<T, E> dao) {
		this.dao = dao;
	}
	
	
	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(T entity) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
