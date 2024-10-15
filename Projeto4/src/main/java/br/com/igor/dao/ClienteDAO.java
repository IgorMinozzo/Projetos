package br.com.igor.dao;

import br.com.igor.domain.Cliente;
import br.com.igor.generic.GenericDAO;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO{

	public ClienteDAO() {
		super(Cliente.class);
	}
	
}
