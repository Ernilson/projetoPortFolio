package br.com.projetoPortFolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoPortFolio.Entity.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
