package br.ufms.cpcx.reinaldo.repository;

import br.ufms.cpcx.reinaldo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
