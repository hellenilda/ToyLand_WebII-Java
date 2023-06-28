package ifpb.web.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifpb.web.rest.model.Cliente;
import ifpb.web.rest.model.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@RequestMapping("/all")
	public List<Cliente> listagemClientes() {
		return clienteService.listagem();
	}

	@GetMapping
	public Cliente listarCliente(@RequestBody Cliente cliente) {
		return clienteService.listar(cliente);
	}

	@PostMapping
	public Cliente novoCliente(@RequestBody Cliente cliente) {
		return clienteService.novo(cliente);
	}

	@PutMapping
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return clienteService.atualizar(cliente);
	}

	@DeleteMapping
	public Long deletarCliente(@RequestBody Cliente cliente) {
		clienteService.deletar(cliente);
		return (long) 0;
	}
}
