package com.projeto.projetoapijavaangular.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.projeto.projetoapijavaangular.model.Lancamento;
import com.projeto.projetoapijavaangular.repository.filter.LancamentoFilter;
import com.projeto.projetoapijavaangular.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
