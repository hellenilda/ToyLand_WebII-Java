package ifpb.web.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ifpb.web.rest.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}