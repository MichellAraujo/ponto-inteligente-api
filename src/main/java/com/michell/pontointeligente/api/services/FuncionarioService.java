package com.michell.pontointeligente.api.services;

import java.util.Optional;

import com.michell.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {

	/**
	 * Persiste um funcionário na base de dados
	 * 
	 * @param funcionario
	 * @return Funcionario
	 * */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Busca e retorna um funcionário dado por um cpf
	 * 
	 * @param cpf
	 * @return Optional<Funcionario>
	 * */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	/**
	 * Busca e retorna um funcionário dado um email
	 * 
	 * @param email
	 * @return Optional<Funcionario>
	 * */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Buscar e retornar um funcionário por Id
	 * 
	 * @param id
	 * @return Optional<Funcionario>
	 * */
	Optional<Funcionario> buscarPorId(Long id);
	
}
