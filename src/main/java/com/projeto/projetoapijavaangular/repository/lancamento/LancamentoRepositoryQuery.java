package com.projeto.projetoapijavaangular.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.projeto.projetoapijavaangular.model.Lancamento;
import com.projeto.projetoapijavaangular.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
