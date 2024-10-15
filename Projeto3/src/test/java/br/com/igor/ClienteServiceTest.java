package br.com.igor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.igor.dao.ClienteDaoMock;
import br.com.igor.dao.IClienteDAO;
import br.com.igor.domain.Cliente;
import br.com.igor.exceptions.DAOException;
import br.com.igor.exceptions.TipoChaveNaoEncontradaException;
import br.com.igor.services.ClienteService;
import br.com.igor.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Igor");
		cliente.setCidade("parai");
		cliente.setEnd("End");
		cliente.setEstado("RS");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		cliente.setSexo("masculino");
		
	}
	
	@Test
	public void pesquisarCliente() throws DAOException {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() throws DAOException {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
		cliente.setNome("Igor Minozzo");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Igor Minozzo", cliente.getNome());
	}
}
