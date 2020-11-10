package com.projeto.projetoapijavaangular.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projetoapijavaangular.model.Pessoa;
import com.projeto.projetoapijavaangular.repository.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository< Pessoa, Long>, PessoaRepositoryQuery {

	void save(Optional<Pessoa> pessoaSalva);	

}
