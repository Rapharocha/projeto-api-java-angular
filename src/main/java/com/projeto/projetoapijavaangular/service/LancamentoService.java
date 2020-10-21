package com.projeto.projetoapijavaangular.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.projetoapijavaangular.model.Lancamento;
import com.projeto.projetoapijavaangular.model.Pessoa;
import com.projeto.projetoapijavaangular.repository.LancamentoRepository;
import com.projeto.projetoapijavaangular.repository.PessoaRepository;
import com.projeto.projetoapijavaangular.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	
	public Lancamento salvar(@Valid Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo()).get();
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
	
		return lancamentoRepository.save(lancamento);
	}

}
