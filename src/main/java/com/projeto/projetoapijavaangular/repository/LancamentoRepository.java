package com.projeto.projetoapijavaangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projetoapijavaangular.model.Lancamento;

public interface LancamentoRepository extends JpaRepository< Lancamento, Long> {

}
