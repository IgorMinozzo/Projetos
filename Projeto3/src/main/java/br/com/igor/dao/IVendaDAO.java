package br.com.igor.dao;

import br.com.igor.dao.generic.IGenericDAO;
import br.com.igor.domain.Venda;
import br.com.igor.exceptions.DAOException;
import br.com.igor.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
