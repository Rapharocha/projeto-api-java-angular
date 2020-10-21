package com.projeto.projetoapijavaangular.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projetoapijavaangular.model.Pessoa;

public interface PessoaRepository extends JpaRepository< Pessoa, Long> {

	void save(Optional<Pessoa> pessoaSalva);	

}
