package com.projeto.projetoapijavaangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projetoapijavaangular.model.Pessoa;

public interface PessoaRepository extends JpaRepository< Pessoa, Long> {

}
