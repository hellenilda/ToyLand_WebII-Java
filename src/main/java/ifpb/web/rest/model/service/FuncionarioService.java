package ifpb.web.rest.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ifpb.web.rest.model.Funcionario;
import ifpb.web.rest.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public List<Funcionario> listagem() {
		return funcionarioRepository.findAll();
	}

	public Funcionario listar(Funcionario funcionario) {
		return funcionarioRepository.findById(funcionario.getMatricula()).get();
	}

	public Funcionario novo(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	public Funcionario atualizar(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	public Long deletar(Funcionario funcionario) {
		funcionarioRepository.deleteById(funcionario.getMatricula());
		return (long) 0;
	}
}
