package br.com.igor.services;

import br.com.igor.dao.IProdutoDAO;
import br.com.igor.domain.Produto;
import br.com.igor.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
