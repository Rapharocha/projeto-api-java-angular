package com.projeto.projetoapijavaangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.projetoapijavaangular.model.Lancamento;
import com.projeto.projetoapijavaangular.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
