package com.michell.pontointeligente.api.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.michell.pontointeligente.api.entities.Lancamento;

import javassist.NotFoundException;

public interface LancamentoService {

	/**
	 * Retorna uma lista paginada de lançamentos de um determinado funcionário.
	 * 
	 * @param funcionarioId
	 * @param pageRequest
	 * @return Page<Lancamento>
	 * */
	Page<Lancamento> buscarPorFuncionarioId(Long id, PageRequest pageRequest);
	
	/**
	 * Retorna um lançamento por ID.
	 * 
	 * @param id
	 * @return Optional<Lancamento>
	 * @throws NotFoundException 
	 * */
	Optional<Lancamento> buscarPorId(Long id) throws NotFoundException;
	
	/**
	 * Persiste um lancamento na base de dados.
	 * 
	 * @param lancamento
	 * @return Lancamento
	 * */
	Lancamento persistir(Lancamento lancamento);

	/**
	 * Remove um lancamento da base de dados.
	 * 
	 * @param id
	 * */
	void remover(Long id);
	
}
