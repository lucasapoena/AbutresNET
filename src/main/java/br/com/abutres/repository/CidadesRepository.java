package br.com.abutres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.abutres.model.Cidade;

public interface CidadesRepository extends JpaRepository<Cidade, Long> {

}
