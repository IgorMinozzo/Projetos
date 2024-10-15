package br.com.igor.dao;

import br.com.igor.domain.Cliente;

import java.util.Collection;
import java.util.Collections;

public interface iClienteDAO {
    public Boolean cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar(Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();
}
