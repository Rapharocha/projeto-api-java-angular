package com.projeto.projetoapijavaangular.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.projeto.projetoapijavaangular.model.Pessoa;
import com.projeto.projetoapijavaangular.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {

	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);
}
