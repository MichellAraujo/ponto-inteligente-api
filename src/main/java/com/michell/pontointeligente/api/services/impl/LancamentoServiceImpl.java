package com.michell.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.michell.pontointeligente.api.entities.Lancamento;
import com.michell.pontointeligente.api.repositories.LancamentoRepository;
import com.michell.pontointeligente.api.services.LancamentoService;

import javassist.NotFoundException;

@Service
public class LancamentoServiceImpl implements LancamentoService {

	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
		log.info("Buscando lançamentos para o funcionário ID {}", funcionarioId);
		return this.lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
	}

	@Cacheable("lancamentoPorId")
	public Optional<Lancamento> buscarPorId(Long id) throws NotFoundException{
		log.info("Buscando um lançamento pelo ID {}", id);
		Optional<Lancamento> lancamento = this.lancamentoRepository.findById(id);
		return  lancamento;
		//return Optional.ofNullable(this.lancamentoRepository.findOne(id));
	}

	/*
	 * @Override public Compte consulterCompte(String code) throws NotFoundException
	 * { Optional<Compte> cp = compteRepository.findById(code); return
	 * cp.orElseThrow(() -> new
	 * NotFoundException("Unable to get Account with Code = " + code)); }
	 */

	@CachePut("lancamentoPorId")
	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistindo o lançamento: {}", lancamento);
		return this.lancamentoRepository.save(lancamento);
	}

	public void remover(Long id) {
		Lancamento lancamento = new Lancamento();
		lancamento.setId(id);
		log.info("Removendo o lançamento ID {}", id);
		this.lancamentoRepository.delete(lancamento);
	}

}
