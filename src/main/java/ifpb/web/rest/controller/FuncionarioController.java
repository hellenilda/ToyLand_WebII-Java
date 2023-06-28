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

import ifpb.web.rest.model.Funcionario;
import ifpb.web.rest.model.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioService;

	@RequestMapping("/all")
	public List<Funcionario> listagemDeFuncionarios() {
		return funcionarioService.listagem();
	}

	@GetMapping
	public Funcionario listarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.listar(funcionario);
	}

	@PostMapping
	public Funcionario novoFuncionario(@RequestBody Funcionario funcinario) {
		return funcionarioService.novo(funcinario);
	}

	@PutMapping
	public Funcionario atualizarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.atualizar(funcionario);
	}

	@DeleteMapping
	public Long deletarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.deletar(funcionario);
	}
}