package com.michell.pontointeligente.api.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.constraints.AssertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.michell.pontointeligente.api.entities.Lancamento;
import com.michell.pontointeligente.api.repositories.LancamentoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class LancamentoServiceTest {

	@Autowired
	private LancamentoService lancamentoService;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Before
	public void setUp() throws Exception{
		/*
		 * BDDMockito
		 * .given(this.lancamentoRepository.findByFuncionarioId(Mockito.anyLong(),
		 * Mockito.any(PageRequest.class))) .willReturn(new PageImpl<Lancamento>(new
		 * ArrayList<Lancamento>()));
		 */
	    //BDDMockito.given(this.lancamentoRepository.findById(1L)).willReturn(value);
	    BDDMockito.given(this.lancamentoRepository.save(Mockito.any(Lancamento.class))).willReturn(new Lancamento());
	}
	
	/*
	 * @Test public void testBuscarLancamentoPorFuncionarioId() {
	 * 
	 * @SuppressWarnings("deprecation") Page<Lancamento> lancamento =
	 * this.lancamentoRepository.findByFuncionarioId(1L, new PageRequest(0, 10));
	 * 
	 * assertNotNull(lancamento); }
	 */
	
	/*
	 * @Test public void testBuscarLancamentoPorId() { Optional<Lancamento>
	 * lancamento = this.lancamentoService.buscarPorId(1L);
	 * 
	 * assertTrue(lancamento.isPresent()); }
	 */
	
	@Test
	public void testPersistirLancamento() {
		Lancamento lancamento = this.lancamentoService.persistir(new Lancamento());
		
		assertNotNull(lancamento);
	}
	
}
