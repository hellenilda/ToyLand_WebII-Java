package ifpb.web.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ifpb.web.rest.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
