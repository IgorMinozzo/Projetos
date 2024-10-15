package br.com.igor.dao;

import br.com.igor.domain.Produto;
import br.com.igor.generic.GenericDAO;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO{

	public ProdutoDAO() {
		super(Produto.class);
	}

}
