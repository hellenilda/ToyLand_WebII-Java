package ifpb.web.rest.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ifpb.web.rest.model.Cliente;
import ifpb.web.rest.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> listagem() {
		return clienteRepository.findAll();
	}

	public Cliente listar(Cliente cliente) {
		return clienteRepository.findById(cliente.getMatricula()).get();
	}

	public Cliente novo(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Cliente atualizar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Long deletar(Cliente clienteRequest) {
		clienteRepository.deleteById(clienteRequest.getMatricula());
		return (long) 0;
	}
}
