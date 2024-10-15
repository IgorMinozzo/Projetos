package br.com.igor.dao;

import br.com.igor.domain.Venda;
import br.com.igor.exceptions.DAOException;
import br.com.igor.exceptions.TipoChaveNaoEncontradaException;
import br.com.igor.generic.GenericDAO;

public class VendaExclusaoJpaDAO extends GenericDAO<Venda, Long> implements IVendaDAO {

	public VendaExclusaoJpaDAO() {
		super(Venda.class);
	}

	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public Venda consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
